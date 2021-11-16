package hackerrank;

import java.util.ArrayList;
import java.util.List;


public class CalculationSum {

    public static void main(String[] args) {

       int number = 7;

       List<Integer> resultFinal = calculation(number);

       System.out.println(resultFinal);
    }

    public static List<Integer> calculation(int maxDigit) {

        List<Integer> result = new ArrayList<>();

        String maxStr = maxDigit + "" + maxDigit + "" + maxDigit + "" + maxDigit;
        int max = Integer.parseInt(maxStr);

        for (int i = 1000; i <= max; i++) {

            int primeiro = i / 1000;
            int segundo = (i % 1000) / 100;
            int terceiro = (i % 100) / 10;
            int quarto = i % 10;

            if (primeiro > maxDigit || segundo > maxDigit || terceiro > maxDigit || quarto > maxDigit) {
                continue;
            }

            if (primeiro + segundo + terceiro + quarto == 21) {
                String soma = primeiro + "" + segundo + "" + terceiro + "" + quarto;
                int somaInt = Integer.parseInt(soma);
                result.add(somaInt);
            }
        }
            if (result.isEmpty()) {
                return null;
        }
        return result;
    }
}
