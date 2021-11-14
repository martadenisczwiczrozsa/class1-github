package testExercises;

//Crie um algoritmo que leia N números e para cada número digitado imprima, o quadrado do número se o
//número for impar ou a raiz quadrada do número se ele for um número par.

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");

        int num = sc.nextInt();

        while (num != 1) {
            if (num % 2 != 0){
                System.out.println(num * num);
            } else {
                System.out.printf("%.2f ", Math.sqrt(num));
                System.out.println();
            }
            num = sc.nextInt();
        }

        sc.close();

    }
}
