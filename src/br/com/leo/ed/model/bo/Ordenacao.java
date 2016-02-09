package br.com.leo.ed.model.bo;

import br.com.leo.ed.model.bo.sortingalgorithms.BubbleSortStrategy;
import br.com.leo.ed.model.bo.sortingalgorithms.HeapSort;
import br.com.leo.ed.model.bo.sortingalgorithms.InsertionSortStrategy;
import br.com.leo.ed.model.bo.sortingalgorithms.QuickSortStrategy;
import br.com.leo.ed.model.bo.sortingalgorithms.SelectionSortStrategy;
import br.com.leo.ed.model.bo.sortingalgorithms.ShellSortStrategy;
import br.com.leo.ed.model.vo.DadosDeOrdenacao;
import br.com.leo.ed.model.Lista;
import br.com.leo.ed.util.Timer;

public class Ordenacao {

    private Lista list = Lista.getInstance();
    private DadosDeOrdenacao save = DadosDeOrdenacao.getInstance();
    private Timer timer;

    public void selecionarAlgoritmo(int index) {

        switch (index) {

            case 0:
                timer = new Timer();

                new InsertionSortStrategy().ordenar(list.getInicialGerada());

                save.setTempoOrdencao(timer.toString());
                save.setAlgoritmoSelecionado("InsertionSort", 0);
                break;

            case 1:
                timer = new Timer();

                new SelectionSortStrategy().ordenar(list.getInicialGerada());

                save.setTempoOrdencao(timer.toString());
                save.setAlgoritmoSelecionado("SelectionSort", 1);
                break;

            case 2:
                timer = new Timer();

                new BubbleSortStrategy().ordenar(list.getInicialGerada());

                save.setTempoOrdencao(timer.toString());
                save.setAlgoritmoSelecionado("BubbleSort", 2);
                break;

            case 3:
                timer = new Timer();

                new QuickSortStrategy().ordenar(list.getInicialGerada());

                save.setTempoOrdencao(timer.toString());
                save.setAlgoritmoSelecionado("QuickSort", 3);
                break;

            case 4:
                timer = new Timer();

                new ShellSortStrategy().ordenar(list.getInicialGerada());

                save.setTempoOrdencao(timer.toString());
                save.setAlgoritmoSelecionado("ShellSort", 4);
                break;

            case 5:
                timer = new Timer();

                new HeapSort().ordenar(list.getInicialGerada());

                save.setTempoOrdencao(timer.toString());
                save.setAlgoritmoSelecionado("HeapSort", 5);
                break;
        }

        list.savePosOrdenacao();
    }

}
