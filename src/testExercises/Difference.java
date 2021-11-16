package testExercises;

//Faça um programa que calcule a diferença entre a soma dos quadrados dos primeiros 100 numeros naturais e o quadrado da soma.
//Ex: A soma dos quadrados dos dez primeiros numeros naturais é 385;
//O quadrado da soma dos dez primeiros numeros naturais é (1 + 2 + ... + 10)2 = 552 = 3025

public class Difference {
    public static void main(String[] args) {

        double sumOfSquares1 = 0;
        double sumNumbers = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares1 = Math.pow(i, 2);
            sumNumbers = sumNumbers + sumOfSquares1;

        }
        System.out.println("Soma dos quadrados dos primeiros 100 números naturais: "+ Math.round(sumNumbers));

        double sum = 0;
        double sumOfSquares2 = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            sumOfSquares2 = Math.pow(sum, 2);
        }
        System.out.println("\nQuadrado da soma dos primeiros 100 números naturais: " + Math.round(sumOfSquares2));

        double difference = sumOfSquares2 - sumNumbers;

        System.out.println("\nDiferença: "+ Math.round(difference));

    }
}
