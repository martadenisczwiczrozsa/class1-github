package testExercises;

//Faça um programa que leia valores inteiros do usuario até que seja digitado dois números iguais.
//Deve-se retornar a soma dos valores lidos sem considerar os valores iguais.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDifferentNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        List<Integer> numberList = new ArrayList<>();

        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (numberList.contains(n)) {
                sum -= n;
                break;
            } else {
                numberList.add(n);
                sum += n;
            }
        }

        System.out.println(sum);
        System.out.println(numberList);

        sc.close();

    }
}
