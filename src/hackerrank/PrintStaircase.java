package hackerrank;

import java.util.Scanner;

public class PrintStaircase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the size of the staircase? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                int zeroCount = n - i - 1;
                if (j <= zeroCount) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
