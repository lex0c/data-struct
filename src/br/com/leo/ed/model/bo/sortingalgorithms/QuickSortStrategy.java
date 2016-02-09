package br.com.leo.ed.model.bo.sortingalgorithms;

import java.util.List;

import br.com.leo.ed.model.vo.DadosDeOrdenacao;

public class QuickSortStrategy implements Strategy {

    private DadosDeOrdenacao save = DadosDeOrdenacao.getInstance();
    private int iteracoes = 0, trocas = 0;

    @Override
    public void ordenar(List<Integer> list) {
        ordenar(list, 0, list.size() - 1);
    }

    private void ordenar(List<Integer> list, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(list, inicio, fim);
            ordenar(list, inicio, posicaoPivo - 1);
            ordenar(list, posicaoPivo + 1, fim);
        }
        save.setIteracoes(iteracoes++);
    }

    private int separar(List<Integer> list, int inicio, int fim) {
        int pivo = list.get(inicio);
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (list.get(i) <= pivo) {
                i++;
            } else if (pivo < list.get(f)) {
                f--;
            } else {
                int troca = list.get(i);
                list.set(i, list.get(f));
                list.set(f, troca);
                i++;
                f--;
            }
        }
        list.set(inicio, list.get(f));
        list.set(f, pivo);
        save.setTrocas(trocas++);
        return f;
    }

}
