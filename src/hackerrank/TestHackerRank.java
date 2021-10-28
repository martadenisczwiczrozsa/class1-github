package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class TestHackerRank {
    public static void main(String[] args) {

        List<Integer> pontuacao = new ArrayList<>();

        pontuacao.add(10);
        pontuacao.add(20);
        pontuacao.add(10);
        pontuacao.add(15);
        pontuacao.add(5);
        pontuacao.add(30);
        pontuacao.add(20);
        int tamanhoDoTime = 2;
        int k = 3;

//        pontuacao.add(17);
//        pontuacao.add(12);
//        pontuacao.add(10);
//        pontuacao.add(2);
//        pontuacao.add(7);
//        pontuacao.add(2);
//        pontuacao.add(11);
//        pontuacao.add(20);
//        pontuacao.add(8);
//        int tamanhoDoTime = 3;
//        int k = 4;

//        pontuacao.add(18);
//        pontuacao.add(5);
//        pontuacao.add(15);
//        pontuacao.add(18);
//        pontuacao.add(11);
//        pontuacao.add(15);
//        pontuacao.add(9);
//        pontuacao.add(7);
//        int tamanhoDoTime = 5;
//        int k = 1;

        long soma = 0;

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
        System.out.println(soma);
    }
}
