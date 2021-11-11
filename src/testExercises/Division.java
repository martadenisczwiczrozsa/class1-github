package testExercises;

//Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido
//um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado
//da divisão do primeiro valor lido pelo segundo valor lido.

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num2 == 0){
            while (num2 == 0){
                System.out.print("Enter the second number: ");
                num2 = sc.nextInt();
            }
        }

        int division = num1 / num2;
        System.out.println(division);
        sc.close();
    }
}
