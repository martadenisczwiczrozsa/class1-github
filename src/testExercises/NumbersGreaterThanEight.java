package testExercises;

//Escreva um algoritmo que leia 10 números do usuário e exiba quantos números são
//maiores do que 8

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersGreaterThanEight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbersList.add(sc.nextInt());
        }

        int count = 0;
        for (int current : numbersList) {
            if (current > 8) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();



    }
}
