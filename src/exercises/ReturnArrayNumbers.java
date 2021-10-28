package exercises;

public class ReturnArrayNumbers {

    public static void main(String[] args) {

        // k - crie um método que recebe um número N e retorna um array de números.
        // O método deve criar o array com o tamanho do número recebido e preencher o array com os valores de 0 até N-1.
        // Ex.: se N for igual a 5, o método deve retornar o array [0, 1, 2, 3, 4].
        // Também imprima cada valor do array retornado em uma linha

        int number = 5;

        int[] numbers = arrayNumbers(number);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static int[] arrayNumbers(int number) {

        int[] arrayNumber = new int[number];

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = i;
        }
        return arrayNumber;
    }
}