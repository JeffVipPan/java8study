package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
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
 *
 * 注意事项：
 *      函数式接口中的抽象方法的参数列表与返回值类型 必须与当前调用的参数列表与返回值类型相同
 *
 */
public class FunctionReference {


    /**
     *  对象：：实例方法名
     */
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

    /**
     * 类：：静态方法名
     */
    @Test
    public void test3() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);

        Comparator<Integer> comparator = Integer::compare;
        System.out.println(com.compare(23, 432));

        System.out.println(comparator.compare(23, 343));
    }


    /**
     *  类：：实例方法名
     *  当第一个参数是 实例方法的调用者，第二个参数是实例方法的参数时，可以使用 ClassName::method
     */
    @Test
    public void test4() {
        BiPredicate<String, String> biPredicate = (x, y) -> {
            return x.equals(y);
        };
        System.out.println(biPredicate.test("x", "y"));

        BiPredicate<String, String> bi = String::equals;
        System.out.println(bi.test("yy", "yy"));

        BiPredicate<Integer, Integer> biPredicate1 = (x, y) -> x.equals(y);


    }



}
