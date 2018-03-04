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
        Stream<String> stream2 = Stream.of("1", "2", "3");

        //4 无限流 无穷尽


    }
}
