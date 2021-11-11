package testExercises;

//Faça um programa que receba 15 valores e no final, escreva o maior e o menor valor lido

import java.util.ArrayList;
import java.util.List;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(68);
        numbers.add(10);
        numbers.add(16);
        numbers.add(21);
        numbers.add(11);
        numbers.add(6);
        numbers.add(43);
        numbers.add(25);
        numbers.add(50);
        numbers.add(73);
        numbers.add(32);
        numbers.add(44);
        numbers.add(13);
        numbers.add(24);
        numbers.add(66);

        int maxValue = Integer.MIN_VALUE;
        int mimValue = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.size(); i++){
            int currentValue = numbers.get(i);

            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
            if (currentValue < mimValue) {
                mimValue = currentValue;
            }
        }

        System.out.println(maxValue);
        System.out.println(mimValue);


    }
}
