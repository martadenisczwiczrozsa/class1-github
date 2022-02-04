package hackerrank;

import java.util.ArrayList;
import java.util.List;

// codigo submetido

public class Test4 {
    public static void main(String[] args) {

        List<Integer> pontuacao = new ArrayList<>();
        pontuacao.add(1);
        pontuacao.add(2);
        pontuacao.add(3);
        pontuacao.add(4);
        pontuacao.add(5);
        pontuacao.add(6);

        int tamanhoDoTime = 2;
        int k = 2;

        int pontuacaoFinal = formacaoDeTime(pontuacao, tamanhoDoTime, k);
        System.out.println(pontuacaoFinal);

    }

    public static Integer formacaoDeTime(List<Integer> pontuacao, int tamanhoDoTime, int k) {

        int soma = 0;

        if (pontuacao.size() < k) {
            for (int h = 0; h < pontuacao.size(); h++) {
                soma += pontuacao.get(h);
            }
        } else {
            for (int i = 0; i < tamanhoDoTime; i++) {
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
                pontuacao.remove(idxMaior);
                soma += maiorValor;
            }
        }
        return soma;
    }
}
