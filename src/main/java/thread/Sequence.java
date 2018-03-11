package thread;

import java.util.UUID;

/**
 * @author ек╥Е
 * @date 09/03/2018 10:35 PM
 */
public class Sequence {

    private volatile int value = 0;

    private int increase() {
        return value++;
    }


    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().substring(0, 5));
        Sequence sequence = new Sequence();
        Sequence sequence1 = new Sequence();



    }



}
