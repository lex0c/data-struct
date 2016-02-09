package br.com.leo.ed.model.bo.sortingalgorithms;

import java.util.List;

import br.com.leo.ed.model.vo.DadosDeOrdenacao;

public class BubbleSortStrategy implements Strategy {

    private DadosDeOrdenacao save = DadosDeOrdenacao.getInstance();
    private int iteracoes = 0, trocas = 0;
    private static boolean ja_ordenado;

    @Override
    public void ordenar(List<Integer> list) {
        int aux;
        for (int i = list.size(); i > 1; i--) {
            ja_ordenado = true;
            save.setIteracoes(iteracoes++);
            for (int j = 1; j < i; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    aux = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, aux);
                    save.setTrocas(trocas++);
                    ja_ordenado = false;
                }
            }
            if (ja_ordenado) {
                break;
            }
        }
    }

}
