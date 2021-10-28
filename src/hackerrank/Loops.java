package hackerrank;

import java.util.Scanner;

public class Loops {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int result = 0;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result = a + i * b;
        }
        System.out.println(result);
        in.close();
    }
}

