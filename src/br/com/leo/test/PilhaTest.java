package br.com.leo.test;

import br.com.leo.ed.model.Pilha;

public class PilhaTest {
    
    public static void main(String[] args) {
        Pilha p = Pilha.getInstance();
        p.adiciona(1);
        p.adiciona(2);
        p.adiciona(5);
        p.remove();
        p.remove();
        
        System.out.println(p.listPilha());
        //System.out.println(p.tamanho());
        //System.out.println(p.isVazia());
        
    }
    
    
}