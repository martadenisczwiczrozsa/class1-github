package testExercises;

//Faça um programa que gera um número aleatório de 1 a 1000. O usuário deve tentar acertar qual o número foi gerado,
// a cada tentativa o programa deverá informar se o chute e menor ou maior que o número gerado.
// O programa acaba quando o usuário acerta o número gerado. O programa deve informar em quantas tentativas o número foi descoberto.

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Random random = new Random();
        int number = random.nextInt(1000);
        //System.out.println(number);

        int attempts = 0;

        while (number != n) {
            if (n < number) {
                System.out.println("Chute menor que o número");
            } else {
                System.out.println("Chute maior que o número");
            }
            attempts++;

            System.out.print("Enter a number: ");
            n = sc.nextInt();
        }

        System.out.println(attempts);
        System.out.println(number);

        sc.close();
    }
}
