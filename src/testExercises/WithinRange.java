package testExercises;

//Ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20]
//(inlcuindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.

import java.util.Scanner;

public class WithinRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inside = 0;
        int outside = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num >= 10 && num <= 20) {
                inside++;
            } else {
                outside++;
            }
        }
        System.out.print("Inside: " + inside + "\n");
        System.out.print("Outside: " + outside);
        sc.close();
    }
}
