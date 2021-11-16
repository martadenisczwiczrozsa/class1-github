package testExercises;

//Escreve um programa que verifique quais numeros entre 1000 e 9999 (inclusive) possuem a seguinte propriedade:
//a soma dos dois dígitos de mais baixa ordem com os dois dígitos de mais alta ordem elevada ao quadrado e igual
//ao próprio numero. Por exemplo, para o inteiro 3025, temos que: 30 + 25 = 55  --> (55 * 55) = 3025

public class EqualToTheNumberItself {
    public static void main(String[] args) {

        for (int i = 1000; i <= 9999; i++) {
            int first = i / 100;
            int second = i % 100;

            int sum = first + second;

            if (Math.pow(sum, 2) == i) {
                System.out.println(i);
            }
        }
    }
}
