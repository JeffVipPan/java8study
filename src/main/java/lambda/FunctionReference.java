package lambda;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author 潘峰
 * @date 24/02/2018 9:46 PM
 *
 * 方法引用 : 若Lambda中的的内容有方法已经实现了，我们可以使用"方法引用"
 *            可以理解为 方法引用是Lambda中的另一种表达形式
 *
 * 主要三种语法格式：
 *      对象：：实例方法名
 *      类：：静态方法名
 *      类：：实例方法名
 */
public class FunctionReference {


    /**
     *  函数式接口中的抽象方法的参数列表与返回值类型 必须与当前调用的参数列表与返回值类型相同
     */
    // 对象：：实例方法名
    @Test
    public void test1() {
        Consumer<String> con = (x -> System.out.println(x));
        con.accept("aaa");

        Consumer<String> consumer = System.out::println;
        consumer.accept("GGG");
    }


    @Test
    public void test2() {
        Employee employee = new Employee("zhangsan", 3400.00, 19);
        Supplier<String> supplier = () -> employee.getName();
        System.out.println(supplier.get());

        Supplier<String> supplier1 = employee::getName;
        System.out.println(supplier1.get());
    }



}
