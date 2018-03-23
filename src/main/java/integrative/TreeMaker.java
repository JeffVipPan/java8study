package integrative;

/**
 * @author �˷�
 * @date 23/03/2018 11:07 AM
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * �����и��ӹ�ϵ�Ķ������Ϊһ�����ṹ
 */
public class TreeMaker {

    /**
     * �����и��ӹ�ϵ�Ķ��󼯺����Ϊһ�����ṹ
     *
     * @param items            Ҫ��ϵĶ��󼯺�
     * @param idProvider       �Ӷ����л�ȡ ID �ķ���
     * @param parentIdProvider �Ӷ����л�ȡ��Ԫ�� ID �ķ���
     * @param addChildFunction ����Ԫ����ӵ���Ԫ�صķ���������Ϊ (parent, child)
     * @param <T>              Ԫ������
     *
     * @return ���ڵ�
     */
    public static <T> List<T> makeTree(
            Collection<T> items,
            Function<T, Object> idProvider,
            Function<T, Object> parentIdProvider,
            BiConsumer<T, T> addChildFunction) {
        List<T> roots = new ArrayList<>();

        Map<Object, T> itemMap = items.stream().collect(Collectors.toMap(idProvider, t -> t));

        for (T item : items) {
            Object parentId = parentIdProvider.apply(item);
            if (parentId == null) {
                roots.add(item);
            } else {
                T parent = itemMap.get(parentId);
                if (parent != null) {
                    addChildFunction.accept(parent, item);
                } else {
                    roots.add(item);
                }
            }
        }

        return roots;
    }
}
