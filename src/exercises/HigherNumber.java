package exercises;

import java.util.Scanner;

public class HigherNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        int higher = higherNumber(a, b);

        System.out.println(higher);
        sc.close();
    }

    public static int higherNumber(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a == b) {
            return 0;
        } else {
            return -1;
        }
    }
}
