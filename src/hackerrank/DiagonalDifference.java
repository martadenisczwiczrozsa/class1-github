package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order of the array: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + ", " + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }


        int sumRight = 0;
        int sumleft = 0;

         for (int i = 0; i < arr.length; i++) {
             sumRight += arr[i][i];
        }

        for (int i = 0; i < arr.length; i++) {
            sumleft+= arr[i][arr.length - 1 - i];
        }

        int result = sumRight - sumleft;

        System.out.println(Math.abs(result));

        sc.close();
    }
}
