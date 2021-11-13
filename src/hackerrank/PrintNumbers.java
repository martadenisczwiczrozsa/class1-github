package hackerrank;

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        double x;
        double count = 0;

        for (int i = 0; i < n; i++) {
            x = Math.pow(2, i) * b;
            count = count + x;
            System.out.print(Math.round(count + a) + " ");
        }
    }
}
