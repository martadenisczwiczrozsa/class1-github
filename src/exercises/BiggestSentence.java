package exercises;

import java.util.Scanner;

public class BiggestSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a phrase A: ");
        String phraseA = sc.nextLine();
        System.out.print("Enter a phrase B: ");
        String phraseB = sc.nextLine();

        int biggest = biggestSentence(phraseA, phraseB);

        System.out.println(biggest);
        sc.close();

    }

    public static int biggestSentence(String phraseA, String phraseB) {
        if (phraseA.length() > phraseB.length()) {
            return 1;
        } else if (phraseA.length() == phraseB.length()) {
            return 0;
        } else {
            return -1;
        }
    }
}



