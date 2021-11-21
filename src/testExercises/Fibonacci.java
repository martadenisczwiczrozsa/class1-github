package testExercises;

/*Cada termo da sequencia Fibonacci é gerado pela soma dos dois últimos termos.
Se começarmos a sequencia pelos números 1 e 2, os 10 primeiros termos da sequencia serão:
        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

Então, considerando a sequencia de fibonacci começando pelos termos 1 e 2, até que o valor do último termo não exceda de 4 milhões.
Encontre a somatória de todos os termos que são PARES. */

public class Fibonacci {
    public static void main(String[] args) {

        int previousNumber = 1;
        int nextNumber = 2;
        int newNumber = previousNumber + nextNumber;

        int sum = 0;

        while (newNumber <= 4000000) {
            previousNumber = nextNumber;
            nextNumber = newNumber;

            if (nextNumber % 2 == 0) {
                sum += nextNumber;
            }

            newNumber = previousNumber + nextNumber;
        }

        System.out.println(sum);
    }
}
