package testExercises;

//Escreva um programa que receba um número inteiro na entrada e verifique se o número
//recebido possui ao menos um dígito com um dígito adjacente igual a ele.
//Caso exista, imprima "sim"; se não existir, imprima "não".

import java.util.Scanner;

public class AdjacentDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.nextLine();

        boolean isAdjacent = false;

        for (int i = 0; i < n.length() - 1; i++) {
            String currentChar1 = n.charAt(i) + "";
            String currentChar2 = n.charAt(i+1) + "";

            int currNumber = Integer.parseInt(currentChar1);
            int digit = Integer.parseInt(currentChar2);

            if (currNumber == digit) {
                isAdjacent = true;
            } else {
                isAdjacent = false;
            }
        }

        if (isAdjacent){
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
