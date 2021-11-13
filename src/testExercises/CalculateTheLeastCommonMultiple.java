package testExercises;

//Escreva um programa para calcular o mínimo múltiplo comum de dois números inteiros.

import java.util.Scanner;

public class CalculateTheLeastCommonMultiple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        int mmc = 1;
        int n = 2;

        while (true) {
            boolean isN1Divisible = false;
            boolean isN2Divisible = false;

            if (n1 % n == 0) {
                n1 = n1 / n;
                isN1Divisible = true;
            }

            if (n2 % n == 0) {
                n2 = n2 / n;
                isN2Divisible = true;
            }

            if (isN1Divisible || isN2Divisible) {
                mmc = mmc * n;

            } else {
                n++;
            }

            if (n1 == 1 && n2 == 1){
                break;
            }
        }

        System.out.println(mmc);
        sc.close();

    }

}
