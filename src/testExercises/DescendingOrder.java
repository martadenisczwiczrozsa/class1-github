package testExercises;

// Faça um programa que leia um numero inteiro positivo N e imprima todos os numeros naturais de 0 até N em ordem decrescente.

import java.util.Scanner;

public class DescendingOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }
}
