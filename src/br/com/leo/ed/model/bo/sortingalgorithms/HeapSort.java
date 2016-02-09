package br.com.leo.ed.model.bo.sortingalgorithms;

import java.util.List;

import br.com.leo.ed.model.vo.DadosDeOrdenacao;

public class HeapSort {

    private DadosDeOrdenacao save = DadosDeOrdenacao.getInstance();
    private int iteracoes = 0, trocas = 0;

    public List<Integer> ordenar(List<Integer> lista) {
        buildMaxHeap(lista);
        int n = lista.size();

        for (int i = lista.size() - 1; i > 0; i--) {
            swap(lista, i, 0);
            maxHeapify(lista, 0, --n);
        }
        return lista;
    }

    private void buildMaxHeap(List<Integer> lista) {
        for (int i = lista.size() / 2 - 1; i >= 0; i--) {
            maxHeapify(lista, i, lista.size());
        }
    }

    private void maxHeapify(List<Integer> lista, int pos, int n) {
        int maxi;
        int l = 2 * pos;
        int right = 2 * pos + 1;
        if ((l < n) && (lista.get(l) > lista.get(pos))) {
            maxi = l;
        } else {
            maxi = pos;
        }
        if (right < n && lista.get(right) > lista.get(maxi)) {
            maxi = right;
        }
        if (maxi != pos) {
            swap(lista, pos, maxi);
            maxHeapify(lista, maxi, n);
        }
        save.setIteracoes(iteracoes++);
    }

    private void swap(List<Integer> lista, int j, int aposJ) {
        int aux = lista.get(j);
        lista.set(j, lista.get(aposJ));
        lista.set(aposJ, aux);
        save.setTrocas(trocas++);
    }

}
