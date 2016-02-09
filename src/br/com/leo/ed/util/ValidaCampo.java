package br.com.leo.ed.util;

public class ValidaCampo {
    private ValidaCampo(){}
    
    private static final String NUMEROS = "0987654321";
    
    public static void apenasNumeros(java.awt.event.KeyEvent evt){
        if(!NUMEROS.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }
   
}