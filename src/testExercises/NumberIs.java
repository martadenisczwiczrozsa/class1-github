package testExercises;

//Ler um valor e escrever se é positivo, negativo ou zero

import java.util.Scanner;

public class NumberIs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.print("Number is positive");
        } else if (number == 0) {
            System.out.print("Number is zero");
        } else {
            System.out.print("Number is negative");
        }

        sc.close();
    }
}
