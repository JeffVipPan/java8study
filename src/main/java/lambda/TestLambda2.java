package lambda;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 潘峰
 * @date 23/02/2018 9:45 PM
 */
public class TestLambda2 {

    /**
     * 比较两个Employee ,先按照年龄比，年龄相同按照姓名比
     */
    @Test
    public void test1() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("李久", 1000.0, 23));
        employees.add(new Employee("李四", 2000.0, 28));
        employees.add(new Employee("王五", 3000.0, 26));
        employees.add(new Employee("赵六", 4000.0, 44));
        employees.add(new Employee("李七", 5000.0, 23));
        employees.add(new Employee("苏八", 6000.0, 29));


        Collections.sort(employees,(e1,e2)->{
            if (e1.getAge() == e1.getAge()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    /**
     * 排序
     * sorted() -自然排序(Comparable)
     * sorted( Comparator com) -定制排序（Comparator）
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

        List<String> list = Arrays.asList("cc", "aa", "dd", "ee", "b");
        list.stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);


    }

    /**
     * 将当前员工名字提取出来放入一个结合
     */
    @Test
    public void test3() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("李久", 1000.0, 23));
        employees.add(new Employee("李四", 2000.0, 28));
        employees.add(new Employee("王五", 3000.0, 26));
        employees.add(new Employee("赵六", 4000.0, 44));
        employees.add(new Employee("李七", 5000.0, 23));
        employees.add(new Employee("苏八", 6000.0, 29));

        employees.stream().
                map(Employee::getName).
                collect(Collectors.joining());


    }
}

