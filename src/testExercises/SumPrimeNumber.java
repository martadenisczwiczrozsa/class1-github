package testExercises;

import java.util.Scanner;

public class SumPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int target = num;
        int sum = 0;

        if (num <= 4) {
            System.out.println("não tem soma");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                    if (target == sum) {
                        break;
                    }
                }
                System.out.println(num + sum);
            }
        }

        sc.close();
    }
}
