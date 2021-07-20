package exercise10;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // j - crie um método que recebe um número N e retorna um arrayList de números.
        // O método deve criar o array com o tamanho do número recebido e preencher o array com os valores de 0 até N-1.
        // Ex.: se N for igual a 5, o método deve retornar o arrayList [0, 1, 2, 3, 4].
        // Também imprima cada valor do array retornado em uma linha

        int n = 5;
        List<Number> resultList = getNumber(n);

        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
        System.out.println(resultList);
    }

    public static List<Number> getNumber(int n) {

        List<Number> resultList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            resultList.add(i);
        }
        return resultList;
    }
}
