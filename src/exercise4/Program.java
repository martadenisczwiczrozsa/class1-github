package exercise4;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrayNumbers = new int[5];

        System.out.print("Enter a target number: ");
        int target = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter a %d° number: ", i + 1);
            arrayNumbers[i] = sc.nextInt();
        }
        int countTarget = countTargetNumber(arrayNumbers, target);
        System.out.println(countTarget);
        sc.close();

    }

    public static int countTargetNumber(int arrayNumbers[], int target) {
        int count = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (target == arrayNumbers[i]) {
                count++;
            }
        }
        return count;
    }
}
