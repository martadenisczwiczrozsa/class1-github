package testExercises;

// Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente

import java.util.Scanner;

public class AscendingOrderThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int A = sc.nextInt();

        System.out.print("Enter the second number: ");
        int B = sc.nextInt();

        System.out.print("Enter the third number: ");
        int C = sc.nextInt();


        if (A < B && B < C) {
            System.out.println(A + " " + B + " " + C);
        }
        else if (A < C && C < B) {
            System.out.println(A + " " + C + " " + B);
        }
        else if (B < A && A < C){
            System.out.println(B + " " + A + " " + C);
        }
        else if (B < C && C < A){
            System.out.println(B + " " + C + " " + A);
        }
        else if (C < B && B < A){
            System.out.println(C + " " + B + " " + A);
        }
        else {
            System.out.println(C + " " + A + " " + B);
        }

        sc.close();

    }
}
