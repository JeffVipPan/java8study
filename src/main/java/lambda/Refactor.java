package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ек╥Е
 * @date 04/03/2018 1:24 PM
 */
public class Refactor {


    @Test
    public List<Integer> getData() {
        List<String> keys = new ArrayList<>();
        keys.add("1234243");
        keys.add("123243");
        keys.add("14324223");
        keys.add("1224243");
        keys.add("155523");


        long start = System.currentTimeMillis();
        List<Integer> result = new ArrayList<>();
        for (String key : keys) {
            result.add(Integer.valueOf(key) % 1000000000);
        }
        System.out.println(System.currentTimeMillis() - start);
        return result;
    }

    @Test
    public List<Integer> test2() {
        List<String> keys = new ArrayList<>();
        keys.add("1234243");
        keys.add("123243");
        keys.add("14324223");
        keys.add("1224243");
        keys.add("155523");
        long start = System.currentTimeMillis();
        List<Integer> collect = keys.stream().map(key -> Integer.valueOf(key) % 10000).collect(Collectors.toList());
        System.out.println(System.currentTimeMillis() - start);
        return collect;
    }





}
