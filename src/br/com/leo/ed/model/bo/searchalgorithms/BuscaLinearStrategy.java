package br.com.leo.ed.model.bo.searchalgorithms;

import java.util.List;

public class BuscaLinearStrategy implements Strategy {
    
    @Override
    public int busca(List<Integer> list, int elemento){
        for(int i = 0; i < list.size(); i++)
            if(list.get(i) == elemento){
                return i;
            }
        return -1;
    }
    
}