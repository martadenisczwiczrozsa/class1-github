package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(3);
        candles.add(1);

        int finalCount = countCandles(candles);
        System.out.println(finalCount);
    }

    public static int countCandles(List<Integer> candles) {
        int highestCandle = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < candles.size(); i++) {
            int current = candles.get(i);

            if (current > highestCandle) {
                highestCandle = current;
                count = 0;
            }

            if (current == highestCandle) {
                count++;
            }
        }
        return count;
    }

}
