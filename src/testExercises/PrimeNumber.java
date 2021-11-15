package testExercises;

//Escreva um programa que receba um número inteiro positivo na entrada e verifique se é primo.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean primer = true;

        if (n <= 1) {
            System.out.println("It's not a prime number");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primer = false;
                    break;
                }
            }
            if (primer) {
                System.out.println("Prime");
            }else {
                System.out.println("Not prime number");
            }
        }
       sc.close();
    }
}

