package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author �˷�
 * @date 22/02/2018 10:24 PM
 */
public class TestLambda {

    List<Employee> employees = new ArrayList<>();


    @Test
    public void test1() {
        employees.add(new Employee("����", 1000.0, 23));
        employees.add(new Employee("����", 2000.0, 22));
        employees.add(new Employee("����", 3000.0, 26));
        employees.add(new Employee("����", 4000.0, 44));
        employees.add(new Employee("����", 5000.0, 12));
        employees.add(new Employee("�հ�", 6000.0, 29));

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




}
