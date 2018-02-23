package lambda;

import org.junit.Test;

import java.awt.*;
import java.util.function.Function;

/**
 * @author ек╥Е
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

    @Test
    public void test2() {
        Function<String, String> function = (str) -> str.toUpperCase();
        System.out.println(function.apply("helloWdelo"));

    }


}
