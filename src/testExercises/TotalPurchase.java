package testExercises;

//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
// Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

import java.util.Locale;
import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the total number of apples purchased: ");
        int numberOfApples = sc.nextInt();

        double purchased = 0;

        if (numberOfApples >= 12) {
            purchased = numberOfApples * 1.30;
        } else {
            purchased = numberOfApples * 1.00;
        }

        System.out.printf("\nTotal: R$%.2f", purchased );

        sc.close();

    }
}
