package br.com.leo.ed.model.vo;

public class DadosDeOrdenacao {

    private DadosDeOrdenacao() {
    }

    private static DadosDeOrdenacao instance;

    private String tempoOrdencao;
    private String algoritmoSelecionado;

    private int algoritmoIndexSelecionado;
    private int iteracoes = 0, trocas = 0;

    //Getters and Setters
    public String getTempoOrdencao() {
        return tempoOrdencao;
    }

    public void setTempoOrdencao(String tempoOrdencao) {
        this.tempoOrdencao = tempoOrdencao;
    }

    public String getAlgoritmoSelecionado() {
        return algoritmoSelecionado;
    }

    public void setAlgoritmoSelecionado(String algoritmoSelecionado, int index) {
        this.algoritmoSelecionado = algoritmoSelecionado;
        algoritmoIndexSelecionado = index;
    }

    public int getAlgoritmoIndexSelecionado() {
        return algoritmoIndexSelecionado;
    }

    public int getIteracoes() {
        return iteracoes;
    }

    public void setIteracoes(int iteracoes) {
        this.iteracoes = iteracoes;
    }

    public int getTrocas() {
        return trocas;
    }

    public void setTrocas(int trocas) {
        this.trocas = trocas;
    }

    public static DadosDeOrdenacao getInstance() {
        if (instance == null) {
            instance = new DadosDeOrdenacao();
        }
        return instance;
    }

}