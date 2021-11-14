package testExercises;

//Faça um programa que receba a idade e o peso de cinco pessoas. Calcule e mostre;
//• a quantidade de pessoas com mais de 90 quilos;
//• a média das idades das sete pessoas.

import java.util.Scanner;

public class AgeAndWeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int amount = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sum += age;

            System.out.print("Enter weight: ");
            int weight = sc.nextInt();
            if (weight >= 90) {
                amount++;
            }
        }

        int average = sum / 5;

        System.out.println("\nAverage: " + average);
        System.out.println("The amount of people over 90 kilos: " + amount);

        sc.close();
    }
}

