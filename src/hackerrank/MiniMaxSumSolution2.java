package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSumSolution2 {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(942381765);
        numberList.add(627450398);
        numberList.add(954153620);
        numberList.add(583762094);
        numberList.add(236817490);

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int i = 0; i < numberList.size(); i++) {
            long sum = 0;
            for (int j = 0; j < numberList.size(); j++) {
                int current = numberList.get(j);
                if (i != j) {
                    sum = sum + current;
                }
            }
            if (sum > max) {
                max = sum;
            }
            if (sum < min) {
                min = sum;
            }
        }
        System.out.println(min + " " + max);

    }
}
