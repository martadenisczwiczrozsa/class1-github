package exercise5;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> number = countNumbers(numbers);
        System.out.println(number);

    }

    public static List<Integer> countNumbers(List<Integer> numbers){
        int highestNumber =  Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        List<Integer> number = new ArrayList<>();

        for(int i = 0; i < numbers.size(); i++) {
            Integer currentNumber = numbers.get(i);
            if (currentNumber > highestNumber) {
                highestNumber = currentNumber;
            }
            if (currentNumber < smallestNumber) {
                smallestNumber = currentNumber;

            }
        }
        number.add(highestNumber);
        number.add(smallestNumber);
        return number;
    }
}
