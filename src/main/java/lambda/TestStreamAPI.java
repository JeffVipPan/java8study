package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author �˷�
 * @date 25/02/2018 10:09 PM
 * <p>
 * һ��Stream ��������
 * <p>
 * 1.����Stream
 * 2.�м����
 * 3.��ֹ����
 */
public class TestStreamAPI {


    @Test
    public void test1() {
        //1.����ͨ��Collection ϵ�м����ṩ��Stream() <������>�� parallelStream ��ȡ��<������ >
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //2.ͨ��Arrays�еľ�̬����stream()��ȡ������
        Employee[] employees = new Employee[10];
        Stream<Employee> stream1 = Arrays.stream(employees);

        //3.Stream �еľ�̬������ȡ��
        Stream<String> stream2 = Stream.of("1", "2", "3");

        //4 ������ ���


    }
}
