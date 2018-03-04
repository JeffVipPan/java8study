package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author ек╥Е
 * @date 26/02/2018 11:41 AM
 */
public class EmployeeLambda {

    @Test
    public void test1() {
        List<Employee> employees = new ArrayList<>(33);

        employees.add(new Employee("3",43,5));

        System.out.println(Objects.hashCode(employees));
        System.out.println(employees.hashCode());

    }
}
