package testExercises;

//Escreva um algoritmo que imprima as seguintes seqüências de números: (1, 1 2 3 4 5 6 7 8 9 10)
//(2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9 10) e assim sucessivamente,
// até que o primeiro número (antes da vírgula), também chegue a 10.

public class SequenceOfNumbers {
    public static void main(String[] args) {

        int count = 1;

        while (count <= 10) {
            System.out.print(count + ", ");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            count++;
            System.out.println();
        }
    }
}
