package integrative;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author �˷�
 * @date 04/03/2018 8:06 PM
 */
public class TestTranction {

    List<Transaction> testTranctions;

    @Before
    public void before() {
        Trader trader1 = new Trader("ZS", "hf");
        Trader trader2 = new Trader("LS", "sh");
        Trader trader3 = new Trader("WW", "hz");
        Trader trader4 = new Trader("ZL", "hz");
        Trader trader5 = new Trader("LQ", "bj");

        testTranctions = Arrays.asList(
                new Transaction(trader1, 2011, 300),
                new Transaction(trader2, 2012, 1000),
                new Transaction(trader3, 2011, 400),
                new Transaction(trader4, 2012, 700),
                new Transaction(trader5, 2012, 950)
        );

    }

    /**
     * �ҳ�2011�귢���Ľ��ף����Ұ��ս��׶�����
     */
    @Test
    public void test1() {
        testTranctions.stream()
                .filter((x) -> x.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue));
    }


    /**
     * ����Ա������Щ���������
     */
    @Test
    public void test2() {
        testTranctions.stream()
                .map(e -> e.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    /**
     * ��������hz�Ľ���Ա��������������
     */
    @Test
    public void test3() {
        testTranctions.stream().filter(e -> e.getTrader().getCity().equals("hz"))
                .sorted(Comparator.comparing(e2 -> e2.getTrader().getName()))
                .forEach(System.out::println);
    }

    /**
     * �������н���Ա�������ַ���������ĸ˳��
     */
    @Test
    public void test4() {
        testTranctions.stream().map((e) -> e.getTrader().getName() )
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    /**
     * ��Щ����Ա����hz��������
     */
    @Test
    public void test5() {
        testTranctions.stream().filter(e -> e.getTrader().getCity().equals("hz"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    /**
     * ��ӡ�����ں��ݵĽ���Ա�����н��׶�
     */
    @Test
    public void test6() {
        testTranctions.stream()
                .filter(e -> e.getTrader().getCity().equals("hz"))
                .map(Transaction::getValue)
                .reduce(Integer::sum);
    }



}
