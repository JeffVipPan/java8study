package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author �˷�
 * @date 24/02/2018 9:46 PM
 *
 * �������� : ��Lambda�еĵ������з����Ѿ�ʵ���ˣ����ǿ���ʹ��"��������"
 *            �������Ϊ ����������Lambda�е���һ�ֱ����ʽ
 *
 * ��Ҫ�����﷨��ʽ��
 *      ���󣺣�ʵ��������
 *      �ࣺ����̬������
 *      �ࣺ��ʵ��������
 *
 * ע�����
 *      ����ʽ�ӿ��еĳ��󷽷��Ĳ����б��뷵��ֵ���� �����뵱ǰ���õĲ����б��뷵��ֵ������ͬ
 *
 */
public class FunctionReference {


    /**
     *  ���󣺣�ʵ��������
     */
    @Test
    public void test1() {
        Consumer<String> con = (x -> System.out.println(x));
        con.accept("aaa");

        Consumer<String> consumer = System.out::println;
        consumer.accept("GGG");
    }


    @Test
    public void test2() {
        Employee employee = new Employee("zhangsan", 3400.00, 19);
        Supplier<String> supplier = () -> employee.getName();
        System.out.println(supplier.get());

        Supplier<String> supplier1 = employee::getName;
        System.out.println(supplier1.get());
    }

    /**
     * �ࣺ����̬������
     */
    @Test
    public void test3() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);

        Comparator<Integer> comparator = Integer::compare;
        System.out.println(com.compare(23, 432));

        System.out.println(comparator.compare(23, 343));
    }


    /**
     *  �ࣺ��ʵ��������
     *  ����һ�������� ʵ�������ĵ����ߣ��ڶ���������ʵ�������Ĳ���ʱ������ʹ�� ClassName::method
     */
    @Test
    public void test4() {
        BiPredicate<String, String> biPredicate = (x, y) -> {
            return x.equals(y);
        };
        System.out.println(biPredicate.test("x", "y"));

        BiPredicate<String, String> bi = String::equals;
        System.out.println(bi.test("yy", "yy"));

        BiPredicate<Integer, Integer> biPredicate1 = (x, y) -> x.equals(y);


    }



}
