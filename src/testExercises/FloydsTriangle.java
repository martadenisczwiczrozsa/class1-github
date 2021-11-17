package testExercises;

// Escreva um programa que leia um número inteiro positivo n e em seguida imprima n
//linhas do chamado Triangulo de Floyd. Para n = 6, temos:
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
//16 17 18 19 20 21

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t" + num);
                num++;
            }
            System.out.println();
        }


    }
}
