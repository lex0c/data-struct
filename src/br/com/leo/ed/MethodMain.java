package br.com.leo.ed;

import br.com.leo.ed.controller.FilaController;
import br.com.leo.ed.controller.PilhaController;
import br.com.leo.ed.controller.PrincipalController;
import br.com.leo.ed.view.FilaUI;
import br.com.leo.ed.view.PilhaUI;
import br.com.leo.ed.view.PrincipalUI;

/**
 * 
 * @author Leonardo Carvalho - 14005992
 */
public class MethodMain {
    
    public static void main(String[] args){
        
        PrincipalUI pView = new PrincipalUI();	
	new PrincipalController(pView);
        
        //PilhaUI pView = new PilhaUI();
        //new PilhaController(pView);
        
        //FilaUI fView = new FilaUI();
	//new FilaController(fView);
        
    }
    
}
