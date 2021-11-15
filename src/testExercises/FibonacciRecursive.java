package testExercises;

// Crie um método recursivo que receba um número inteiro n, e imprima o e-nésimo elemento da sequência de Fibonacci.

import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int finalFibonacci = fibonacci(n);

        System.out.println(finalFibonacci);
        sc.close();

    }

    public static int fibonacci (int n) {
        if(n == 1) {
            return 0;
        } else {
            if (n == 2) {
                return  1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }
}
