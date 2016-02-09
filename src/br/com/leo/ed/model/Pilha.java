package br.com.leo.ed.model;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
    private Pilha(){}
    
    private static Pilha instance;
    private List<Integer> pilha;
    
    public void adiciona(int elemento){
        checkList().add(elemento);
    }
    
    public boolean remove(){
        if(!isVazia()){
            checkList().remove(pilha.size()-1);
            return true;
        }
        return false;
    }
    
    private boolean isVazia(){
        return pilha.isEmpty();
    }
    
    public int tamanho(){
        return pilha.size();
    }
    
    public String listPilha(){
        return pilha.toString();
    }
    
    private List<Integer> checkList(){
        if(pilha == null){
            pilha = new ArrayList<>();
        }
        return pilha;
    }
    
    public static Pilha getInstance(){
        if(instance == null){
            instance = new Pilha();
        }
        return instance;
    }
    
}