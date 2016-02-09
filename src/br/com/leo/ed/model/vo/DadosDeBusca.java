package br.com.leo.ed.model.vo;

public class DadosDeBusca {

    private DadosDeBusca() {
    }

    private static DadosDeBusca instance;

    private String algoritmoSelecionado;
    private int posicaoElemento;

    //Getters and Setters
    public String getAlgoritmoSelecionado() {
        return algoritmoSelecionado;
    }

    public void setAlgoritmoSelecionado(String algoritmoSelecionado) {
        this.algoritmoSelecionado = algoritmoSelecionado;
    }

    public int getPosicaoElemento() {
        return posicaoElemento;
    }

    public void setPosicaoElemento(int posicaoElemento) {
        this.posicaoElemento = posicaoElemento;
    }

    public static DadosDeBusca getInstance() {
        if (instance == null) {
            instance = new DadosDeBusca();
        }
        return instance;
    }

}