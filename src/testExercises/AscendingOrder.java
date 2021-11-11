package testExercises;

// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

import java.util.Scanner;

public class AscendingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();


        if (first < second) {
            System.out.println(first + " " + second);
        } else {
            System.out.println(second + " " + first);
        }

        sc.close();

    }
}
