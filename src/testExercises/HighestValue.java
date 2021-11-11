package testExercises;

//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class HighestValue {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.print(first);
        } else {
            System.out.print(second);
        }

        sc.close();
    }
}
