package integrative;

/**
 * @author 潘峰
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
 * 将具有父子关系的对象组合为一个树结构
 */
public class TreeMaker {

    /**
     * 将具有父子关系的对象集合组合为一个树结构
     *
     * @param items            要组合的对象集合
     * @param idProvider       从对象中获取 ID 的方法
     * @param parentIdProvider 从对象中获取父元素 ID 的方法
     * @param addChildFunction 将子元素添加到父元素的方法，参数为 (parent, child)
     * @param <T>              元素类型
     *
     * @return 根节点
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
