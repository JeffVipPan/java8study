package lambda;

import org.junit.Test;

import java.util.function.Consumer;

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
     *  void accept(T t) 返回值必须与  println 参数与返回值相同
     */
    @Test
    public void test4() {
        Consumer<String> con = (x -> System.out.println(x));
        con.accept("aaa");

        Consumer<String> consumer = System.out::println;
        consumer.accept("GGG");
    }

}
