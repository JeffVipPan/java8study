package lambda;

import org.junit.Test;

import java.util.function.Consumer;

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
     *  void accept(T t) ����ֵ������  println �����뷵��ֵ��ͬ
     */
    @Test
    public void test4() {
        Consumer<String> con = (x -> System.out.println(x));
        con.accept("aaa");

        Consumer<String> consumer = System.out::println;
        consumer.accept("GGG");
    }

}
