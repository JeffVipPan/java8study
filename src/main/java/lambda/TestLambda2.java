package lambda;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author �˷�
 * @date 23/02/2018 9:45 PM
 */
public class TestLambda2 {

    /**
     * �Ƚ�����Employee ,�Ȱ�������ȣ�������ͬ����������
     */
    @Test
    public void test1() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("���", 1000.0, 23));
        employees.add(new Employee("����", 2000.0, 28));
        employees.add(new Employee("����", 3000.0, 26));
        employees.add(new Employee("����", 4000.0, 44));
        employees.add(new Employee("����", 5000.0, 23));
        employees.add(new Employee("�հ�", 6000.0, 29));


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
     * ����
     * sorted() -��Ȼ����(Comparable)
     * sorted( Comparator com) -��������Comparator��
     */
    @Test
    public void test2() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("���", 1000.0, 23));
        employees.add(new Employee("����", 2000.0, 28));
        employees.add(new Employee("����", 3000.0, 26));
        employees.add(new Employee("����", 4000.0, 44));
        employees.add(new Employee("����", 5000.0, 23));
        employees.add(new Employee("�հ�", 6000.0, 29));

        List<String> list = Arrays.asList("cc", "aa", "dd", "ee", "b");
        list.stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);


    }

    /**
     * ����ǰԱ��������ȡ��������һ�����
     */
    @Test
    public void test3() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("���", 1000.0, 23));
        employees.add(new Employee("����", 2000.0, 28));
        employees.add(new Employee("����", 3000.0, 26));
        employees.add(new Employee("����", 4000.0, 44));
        employees.add(new Employee("����", 5000.0, 23));
        employees.add(new Employee("�հ�", 6000.0, 29));

        employees.stream().
                map(Employee::getName).
                collect(Collectors.joining());


    }
}

