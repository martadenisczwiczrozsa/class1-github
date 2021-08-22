package exercises;

import java.util.List;
import java.util.Scanner;

public class ContainsNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrayNumbers = new int[5];

        System.out.print("Enter a target number: ");
        int target = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter a %d° number: ", i + 1);
            arrayNumbers[i] = sc.nextInt();
        }
        boolean targetNumber = containsNumber(arrayNumbers, target);
        System.out.println(targetNumber);
        sc.close();

    }

    public static boolean containsNumber(int arrayNumbers[], int target) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (target == arrayNumbers[i]) {
                return true;
            }
        }
        return false;
    }
}
