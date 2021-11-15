package testExercises;

//Faça um programa que leia um numero inteiro positivo N e imprima todos os numeros naturais de 0 até N em ordem crescente

import java.util.Scanner;

public class AscendingOrder2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
