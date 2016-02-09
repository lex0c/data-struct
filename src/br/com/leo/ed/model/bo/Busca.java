package br.com.leo.ed.model.bo;

import br.com.leo.ed.model.bo.searchalgorithms.BuscaBinariaStrategy;
import br.com.leo.ed.model.bo.searchalgorithms.BuscaLinearStrategy;
import br.com.leo.ed.model.vo.DadosDeBusca;
import br.com.leo.ed.model.Lista;

public class Busca {

    private Lista list = Lista.getInstance();
    private DadosDeBusca save = DadosDeBusca.getInstance();

    public void selecionarAlgoritmo(int index, int elemento) {

        switch (index) {

            case 0:
                save.setPosicaoElemento(new BuscaBinariaStrategy()
                        .busca(list.getInicialGerada(), elemento)
                );

                save.setAlgoritmoSelecionado("Busca Binaria");
                break;

            case 1:
                save.setPosicaoElemento(new BuscaLinearStrategy()
                        .busca(list.getInicialGerada(), elemento)
                );

                save.setAlgoritmoSelecionado("Busca Linear");
                break;

        }
    }

}
