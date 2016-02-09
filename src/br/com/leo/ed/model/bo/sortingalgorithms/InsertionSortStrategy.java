package br.com.leo.ed.model.bo.sortingalgorithms;

import java.util.List;

import br.com.leo.ed.model.vo.DadosDeOrdenacao;

public class InsertionSortStrategy implements Strategy {

    private DadosDeOrdenacao save = DadosDeOrdenacao.getInstance();
    private int iteracoes = 0, trocas = 0;

    @Override
    public void ordenar(List<Integer> list) {
        int aux;
        for (int i = 0; i < list.size(); i++) {
            aux = list.get(i);
            int j = i;
            save.setIteracoes(iteracoes++);
            while (j > 0 && list.get(j - 1) > aux) {
                list.set(j, list.get(j - 1));
                j--;
                save.setTrocas(trocas++);
            }
            list.set(j, aux);
        }

    }

}
