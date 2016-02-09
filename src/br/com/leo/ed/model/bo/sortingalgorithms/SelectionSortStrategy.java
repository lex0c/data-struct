package br.com.leo.ed.model.bo.sortingalgorithms;

import java.util.List;

import br.com.leo.ed.model.vo.DadosDeOrdenacao;

public class SelectionSortStrategy implements Strategy {

    private DadosDeOrdenacao save = DadosDeOrdenacao.getInstance();
    private int iteracoes = 0, trocas = 0;

    @Override
    public void ordenar(List<Integer> list) {
        int aux;
        for (int i = 1; i < list.size(); i++) {
            save.setIteracoes(iteracoes++);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) > list.get(i)) {
                    aux = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, aux);
                    save.setTrocas(trocas++);
                }
            }
        }
    }

}
