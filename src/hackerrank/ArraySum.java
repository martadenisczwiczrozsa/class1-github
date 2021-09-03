package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();


        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }

        int sum = 0;

        for (int i = 0; i < ar.size(); i++) {
            sum = sum + ar.get(i);
        }

        System.out.println(sum);

    }

}
