package lambda;

import org.junit.Test;

import java.awt.*;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author �˷�
 * @date 23/02/2018 10:03 PM
 */
public class TestUpperFunction {

    UpperFunction<String> upperFunction = (str) -> {
        return str.toUpperCase();
    };



    @Test
    public void test1() {
        String helloWorld = upperFunction.upperStr("helloWorld");
        System.out.println(helloWorld);
    }

    /**
     * Function<T,R>  R accept(T t)  t�����룬R�����
     */
    @Test
    public void test2() {
        Function<String, String> function = (str) -> str.toUpperCase();
        System.out.println(function.apply("helloWdelo"));

    }


    /**
     *  BiFunction  �������룬һ�����
     */
    @Test
    public void test3() {
        BiFunction<Integer, Integer, Integer> biFunction = (i1, i2) -> {
            return i1 * i2;
        };
          Integer apply = biFunction.apply(100, 40);
        System.out.println(apply);
    }

}
