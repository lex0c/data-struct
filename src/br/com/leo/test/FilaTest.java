package br.com.leo.test;

import br.com.leo.ed.model.Fila;

public class FilaTest {
    
    public static void main(String[] args) {
        
        Fila f = Fila.getInstance();
        
        f.adiciona(5);
        f.adiciona(7);
        f.adiciona(10);
        f.remove();
        f.remove();
        
        System.out.println(f.listFila());
        
    }
    
}