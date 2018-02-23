package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
}

