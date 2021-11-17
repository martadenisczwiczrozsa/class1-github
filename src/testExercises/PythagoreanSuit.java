package testExercises;

//Faça um programa que calcule o terno pitagórico a, b, c, para o qual a + b + c = 1000.
// Um terno pitagórico é um conjunto de três números naturais, a, b, c, para a qual, a *a + b*b = c*c
// Por exemplo, 3*3 + 4*4 = 9 + 16 = 25 = 5*5

public class PythagoreanSuit {
    public static void main(String[] args) {


        //double c = 1000;

        double pythagoreanSuit = 0;


        //while (pythagoreanSuit <= 1000) {
            for (int a = 1; a <= 1000; a++) {
                for (int b = a; b <= 1000; b++) {
                    for (int c = b; c <= 1000; c++) {
                        pythagoreanSuit = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
                        if (pythagoreanSuit == 1000) {
                            System.out.println(a + " " + b + " " + c);
                            break;
                        }
                    }

//                    pythagoreanSuit = Math.pow(a, 2) + Math.pow(b, 2);
//
//                    //System.out.println(a + " " + b);
//                    if (pythagoreanSuit == c) {
//                        System.out.println(pythagoreanSuit);
//                    }
//                }
            }
            //pythagoreanSuit++;
        }
    }
}
