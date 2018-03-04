package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author 潘峰
 * @date 04/03/2018 7:47 PM
 */
public class ExamStream {

    /**
     * 给定一个数字列表，返回每个数平方构成的列表
     */
    @Test
    public void test1() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map(x -> x * x).forEach(System.out::println);
    }

    /**
     * 如何用map,reduce 数一数流中有多少Employee
     */
    @Test
    public void test2() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("李久", 1000.0, 23));
        employees.add(new Employee("李四", 2000.0, 28));
        employees.add(new Employee("王五", 3000.0, 26));
        employees.add(new Employee("赵六", 4000.0, 44));
        employees.add(new Employee("李七", 5000.0, 23));
        employees.add(new Employee("苏八", 6000.0, 29));

        Optional<Integer> reduce = employees.stream().map((x) -> 1).reduce(Integer::sum);

    }
}
