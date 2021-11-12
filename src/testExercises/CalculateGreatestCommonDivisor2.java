package testExercises;

//Escreva um programa para calcular o máximo divisor comum de dois números inteiros.

import java.util.Scanner;

public class CalculateGreatestCommonDivisor2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        int mdc = 0;
        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                mdc = i;
            }
        }


        System.out.println(mdc);
        sc.close();
    }
}
