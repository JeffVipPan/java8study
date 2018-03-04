package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author �˷�
 * @date 04/03/2018 7:47 PM
 */
public class ExamStream {

    /**
     * ����һ�������б�����ÿ����ƽ�����ɵ��б�
     */
    @Test
    public void test1() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map(x -> x * x).forEach(System.out::println);
    }

    /**
     * �����map,reduce ��һ�������ж���Employee
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

        Optional<Integer> reduce = employees.stream().map((x) -> 1).reduce(Integer::sum);

    }
}
