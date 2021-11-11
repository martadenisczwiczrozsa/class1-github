package testExercises;

//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class AgeInDays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the years: ");
        int age = sc.nextInt();
        System.out.print("Enter the months: ");
        int months = sc.nextInt();
        System.out.print("Enter the days: ");
        int days = sc.nextInt();

        int ageInDays = (age * 365) + (months * 30) + days;

        System.out.println(ageInDays);
        sc.close();
    }
}
