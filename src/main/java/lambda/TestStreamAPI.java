package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author �˷�
 * @date 25/02/2018 10:09 PM
 * <p>
 * һ��Stream ��������
 * <p>
 * 1.����Stream
 * 2.�м����
 * 3.��ֹ����
 */
public class TestStreamAPI {


    @Test
    public void test1() {
        //1.����ͨ��Collection ϵ�м����ṩ��Stream() <������>�� parallelStream ��ȡ��<������ >
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //2.ͨ��Arrays�еľ�̬����stream()��ȡ������
        Employee[] employees = new Employee[10];
        Stream<Employee> stream1 = Arrays.stream(employees);

        //3.Stream �еľ�̬������ȡ��
        Stream<String> stream2 = Stream.of("4", "2", "3");


        stream2.map(s -> Integer.valueOf(s) * 10).forEach(System.out::println);

        //4 ������ ���
    }

    /**
     * 277
     */
    @Test
    public void test2() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            stringList.add("aaa" + i);
        }
        long l = System.currentTimeMillis();
        stringList.forEach(x -> {
                    System.out.println(x.toUpperCase());
                }
        );
        System.out.println(System.currentTimeMillis() - l);
    }

    /**
     *224
     */
    @Test
    public void test3() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            stringList.add("aaa" + i);
        }
        long l = System.currentTimeMillis();
        stringList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        System.out.println(System.currentTimeMillis() - l);
    }


    /**
     *���  112
     */
    @Test
    public void test4() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            stringList.add("aaa" + i);
        }
        long l = System.currentTimeMillis();
        for (String s : stringList) {
            System.out.println(s.toUpperCase());
        }
        System.out.println(System.currentTimeMillis() - l);

    }


}

