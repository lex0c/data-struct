package br.com.leo.ed.model.bo.searchalgorithms;

import java.util.List;

public interface Strategy {
    
    int busca(List<Integer> list, int elemento);
    
}