package testExercises;

//Escreva um programa para calcular a soma dos números positivos, inferiores ou iguais a 1000

public class SumNumbers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
