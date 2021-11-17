package testExercises;

// Faça um programa que calcule o maior número palíndromos feito a partir do produto de dois números de 3 dígitos.
// Ex: O maior palíndromos feito a partir do produto de dois números de dois dígitos e 9009 = 91*99.

public class HighestPalindromicNumber {
    public static void main(String[] args) {


        int highestPalindromicNumber = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = i + 1; j <= 999; j++) {
                int multiplication = i * j;
                int inverseNum = inverse(multiplication);

                if (multiplication == inverseNum) {
                    if (highestPalindromicNumber < multiplication) {
                        highestPalindromicNumber = multiplication;
                    }
                }
            }
        }
        System.out.println(highestPalindromicNumber);
    }

    public static int inverse (int num) {
        int inverse = 0;
        while (num > 0) {
            inverse = inverse * 10;
            inverse = inverse + (num % 10);
            num = num / 10;
        }
        return inverse;
    }


}
