package testExercises;

//Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.

public class IsMultiple {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
