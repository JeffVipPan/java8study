package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 潘峰
 * @date 25/02/2018 10:09 PM
 * <p>
 * 一：Stream 三个操作
 * <p>
 * 1.创建Stream
 * 2.中间操作
 * 3.终止操作
 */
public class TestStreamAPI {


    @Test
    public void test1() {
        //1.可以通过Collection 系列集合提供的Stream() <串行流>或 parallelStream 获取流<并行流 >
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //2.通过Arrays中的静态方法stream()获取数组流
        Employee[] employees = new Employee[10];
        Stream<Employee> stream1 = Arrays.stream(employees);

        //3.Stream 中的静态方法获取流
        Stream<String> stream2 = Stream.of("4", "2", "3");


        stream2.map(s -> Integer.valueOf(s) * 10).forEach(System.out::println);

        //4 无限流 无穷尽
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
     *最快  112
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

