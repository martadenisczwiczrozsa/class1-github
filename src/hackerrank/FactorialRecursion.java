package hackerrank;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the factorial number: ");
        int n = in.nextInt();

        int result = factorial(n);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

