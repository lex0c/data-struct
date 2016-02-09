package br.com.leo.ed.model;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    private Fila(){}
    
    private static Fila instance;
    private List<Integer> fila;
    
    public void adiciona(int elemento){
        checkList().add(elemento);
    }
    
    public boolean remove(){
        if(!isVazia()){
            checkList().remove(0);
            return true;
        }
        return false;
    }
    
    public boolean isVazia(){
        return fila.isEmpty();
    }
    
    public int tamanho(){
        return fila.size();
    }
    
    public String listFila(){
        return fila.toString();
    }
    
    private List<Integer> checkList(){
        if(fila == null){
            fila = new ArrayList<>();
        }
        return fila;
    }
    
    public static Fila getInstance(){
        if(instance == null){
            instance = new Fila();
        }
        return instance;
    }
    
}