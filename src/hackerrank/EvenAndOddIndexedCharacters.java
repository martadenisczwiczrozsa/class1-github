package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class EvenAndOddIndexedCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int T = sc.nextInt();
        sc.nextLine();


        List<String> even = new ArrayList<>();
        List<String> odd = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            System.out.print("Enter a string: ");
            String S = sc.nextLine();

            for (int j = 0; j < S.length(); j++) {
                if (j % 2 == 0) {
                    even.add(S.charAt(j) + "");
                } else {
                    odd.add(S.charAt(j) + "");
                }
            }
            System.out.print(even.stream().collect(joining("")) + " " + odd.stream().collect(joining("")) + "\n");
            even.clear();
            odd.clear();
        }

        sc.close();
    }
}
