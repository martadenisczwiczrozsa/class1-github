package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static long formacaoDeTime(List<Integer> pontuacao, int tamanho_do_time, int k) {
        // Write your code here
        long soma = 0;

        if (pontuacao.size() < k) {

            for (int h = 0; h < pontuacao.size(); h++) {
                soma += pontuacao.get(h);
            }

        } else {
            List<Integer> listaFinal = new ArrayList<>();

            for (int i = 0; i < tamanho_do_time; i++) {

                int idxMaior = 0;
                int maiorValor = pontuacao.get(idxMaior);

                for (int j = 0; j < pontuacao.size(); j++) {

                    if ((j <= k - 1) || (j >= pontuacao.size() - k && j <= pontuacao.size() - 1)) {

                        int currentValor = pontuacao.get(j);
                        if (currentValor > maiorValor) {
                            maiorValor = currentValor;
                            idxMaior = j;
                        }
                    }
                }

                listaFinal.add(maiorValor);
                pontuacao.remove(idxMaior);
            }

            for (int l = 0; l < listaFinal.size(); l++) {
                soma += listaFinal.get(l);
            }

        }
        return soma;

    }
}

