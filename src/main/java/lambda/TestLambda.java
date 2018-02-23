package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

/**
 * @author 潘峰
 * @date 22/02/2018 10:24 PM
 */
public class TestLambda {

    List<Employee> employees = new ArrayList<>();


    @Test
    public void test1() {
        employees.add(new Employee("张三", 1000.0, 23));
        employees.add(new Employee("李四", 2000.0, 29));
        employees.add(new Employee("王五", 3000.0, 26));
        employees.add(new Employee("赵六", 4000.0, 44));
        employees.add(new Employee("李七", 5000.0, 12));
        employees.add(new Employee("苏八", 6000.0, 29));

        employees.stream().filter(employee -> employee.getSalary() > 3000.0).limit(1).map(Employee::getName).forEach(System.out::println);

        Runnable runnable = () -> {
            System.out.println("hello");
        };
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println(thread.getName());

    }

    @Test
    public void test2() {
        Comparator<Integer> comparable = (x1, x2) -> Integer.compare(x1, x2);
        int compare = comparable.compare(7, 6);
        System.out.println(compare);
    }



    @Test
    public void test3() {
        Integer operational = operational(100, (x) -> x * x);
        System.out.println(operational);
    }


    public Integer operational(Integer num, MyFunciton<Integer> myFunciton) {
        return myFunciton.getVal(num);
    }


    @Test
    public void test4() {
        Function<Integer, Integer> function = (x1) -> x1 * x1;
        Integer apply = function.apply(100);
        System.out.println(apply);
    }



}
