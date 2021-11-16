package testExercises;

//Faça um algoritmo que leia um numero positivo e imprima seus divisores.

import java.util.Scanner;

public class NumberDivisor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
