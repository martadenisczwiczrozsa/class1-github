package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(3);
        numberList.add(5);
        numberList.add(7);
        numberList.add(9);


        int sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            int current = numberList.get(i);
            sum = sum + current;
        }

        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            int current = numberList.get(i);
            sumList.add(sum - current);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < sumList.size(); i++) {
            int current = sumList.get(i);
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }
        System.out.print(min + " " + max);
    }
}
