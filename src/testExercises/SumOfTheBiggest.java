package testExercises;

//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;

public class SumOfTheBiggest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int sum = 0;

        if (num1 < num2 && num1 < num3) {
            sum = num3 + num2;
        } else if (num2 < num1 && num2 < num3){
            sum = num3 + num1;
        } else {
            sum = num2 + num1;
        }

        System.out.print(sum);
        sc.close();

    }
}
