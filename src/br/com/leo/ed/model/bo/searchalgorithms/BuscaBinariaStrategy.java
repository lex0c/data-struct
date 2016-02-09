package br.com.leo.ed.model.bo.searchalgorithms;

import java.util.List;

public class BuscaBinariaStrategy implements Strategy {
 
    @Override
    public int busca(List<Integer> list, int elemento) {
	return buscaBinariaRecursiva(list, 0, list.size()-1, elemento);
    }

    private int buscaBinariaRecursiva(List<Integer> list, int menor, int maior, int elemento){
	int media = (maior + menor)/2;
        int valorMeio = list.get(media);        
	if (menor > maior){
            return -1;
        }else if(valorMeio == elemento){ 
            return media;
        }else if (valorMeio < elemento){
            return buscaBinariaRecursiva(list, media+1, maior, elemento);
        }else{
            return buscaBinariaRecursiva(list, menor, media-1, elemento);
        }
    }
}