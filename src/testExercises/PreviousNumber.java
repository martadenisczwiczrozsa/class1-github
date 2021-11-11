package testExercises;


//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

import java.util.Scanner;

public class PreviousNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int finalNumber = n - 1;
        System.out.print(finalNumber);

        sc.close();

    }
}
