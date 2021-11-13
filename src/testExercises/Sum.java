package testExercises;

//Escreva um algoritmo que calcule a soma dos números de 1 a 15.

public class Sum {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 15; i++) {
            sum = sum + i;
        }
        System.out.print("The sum is: " + sum);

    }
}
