package br.com.leo.ed.model.bo.sortingalgorithms;

import java.util.List;

import br.com.leo.ed.model.vo.DadosDeOrdenacao;

public class ShellSortStrategy implements Strategy {

    private DadosDeOrdenacao save = DadosDeOrdenacao.getInstance();
    private int iteracoes = 0, trocas = 0;

    @Override
    public void ordenar(List<Integer> list) {
        int h = 1;
        while (h < list.size()) {
            h = h * 3 + 1;
        }
        h = h / 3;
        int c, j;
        while (h > 0) {
            for (int i = h; i < list.size(); i++) {
                c = list.get(i);
                j = i;
                while (j >= h && list.get(j - h) > c) {
                    list.set(j, list.get(j - h));
                    j = j - h;
                    save.setIteracoes(iteracoes++);
                }
                list.set(j, c);
                save.setTrocas(trocas++);
            }
            h = h / 2;
        }
    }

}
