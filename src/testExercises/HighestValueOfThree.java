package testExercises;

//Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class HighestValueOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        System.out.print("Enter the third number: ");
        int third = sc.nextInt();

        if (first > second && first > third) {
            System.out.print(first);
        } else if (second > first && second > third){
            System.out.print(second);
        } else {
            System.out.print(third);
        }

        sc.close();
    }
}
