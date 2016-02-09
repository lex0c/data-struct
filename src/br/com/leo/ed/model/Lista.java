package br.com.leo.ed.model;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private Lista(){}

    private static Lista instance;

    private List<Integer> inicialGerada;
    private List<Integer> preOrdenacao;
    private List<Integer> posOrdenacao;

    private String tipoGerado;

    public void adicionar(int elemento) {
        checkInicialGerada().add(elemento);
        checkPreOrdenacao().add(elemento);
    }

    public void adicionar(int posicao, int elemento) {
        checkInicialGerada().add(posicao, elemento);
        checkPreOrdenacao().add(posicao, elemento);
    }

    public void remover(int posicao) {
        checkInicialGerada().remove(posicao);
        checkPreOrdenacao().remove(posicao);
    }

    public void savePreOrdenacao() {
        preOrdenacao = new ArrayList<>();
        preOrdenacao.addAll(inicialGerada);
    }

    public void savePosOrdenacao() {
        posOrdenacao = new ArrayList<>();
        posOrdenacao.addAll(inicialGerada);
    }

    public void limpar() {
        inicialGerada.clear();
        preOrdenacao.clear();
        posOrdenacao.clear();
        System.gc();
    }

    public void factory(String tipo, int tamanho) {

        inicialGerada = new ArrayList<>();

        switch (tipo) {

            case "Aleatório":
                for (int i = 0; i < tamanho; i++) {
                    inicialGerada.add(i, (int) (Math.random() * tamanho * 11));
                }

                tipoGerado = "Aleatório";
                break;

            case "Decrescente":
                int aux = tamanho;
                for (int i = 0; i < tamanho; i++) {
                    inicialGerada.add(i, aux);
                    aux--;
                }

                tipoGerado = "Decrescente";
                break;

            case "Crescente":
                for (int i = 0; i < tamanho; i++) {
                    inicialGerada.add(i, (int) i);
                }

                tipoGerado = "Crescente";
                break;

        }

        savePreOrdenacao();
    }

    private List<Integer> checkInicialGerada() {
        if (inicialGerada == null) {
            inicialGerada = new ArrayList<>();
        }
        return inicialGerada;
    }

    private List<Integer> checkPreOrdenacao() {
        if (preOrdenacao == null) {
            preOrdenacao = new ArrayList<>();
        }
        return preOrdenacao;
    }

    //Getters and Setters
    public List<Integer> getInicialGerada() {
        return inicialGerada;
    }

    public List<Integer> getPreOrdenacao() {
        return preOrdenacao;
    }

    public List<Integer> getPosOrdenacao() {
        return posOrdenacao;
    }

    public String getTipoGerado() {
        return tipoGerado;
    }

    public static Lista getInstance() {
        if (instance == null) {
            instance = new Lista();
        }
        return instance;
    }

}
