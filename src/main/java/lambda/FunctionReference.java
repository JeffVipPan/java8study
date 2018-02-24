package lambda;

import org.junit.Test;

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
 */
public class FunctionReference {


    /**
     *  ����ʽ�ӿ��еĳ��󷽷��Ĳ����б��뷵��ֵ���� �����뵱ǰ���õĲ����б��뷵��ֵ������ͬ
     */
    // ���󣺣�ʵ��������
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



}
