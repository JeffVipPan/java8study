package lambda;

import lombok.Data;

import java.util.List;

/**
 * @author ек╥Е
 * @date 22/02/2018 10:25 PM
 */
@Data
public class Employee {

    private String name;

    private double salary;

    private int age;

    private List<Account> accounts;

    public void better() {

    }


    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
