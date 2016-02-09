package br.com.leo.ed.util;

import java.util.Date;

/** 
* This code is free software; you can redistribute it and/or modify it under 
* the terms of the GNU Lesser General Public License as published by the Free 
* Software Foundation; either version 2.1 of the License, or (at your option) 
* any later version. 
* 
* This code is distributed in the hope that it will be useful, but WITHOUT ANY 
* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR 
* A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more 
* details. 
* 
* You should have received a copy of the GNU Lesser General Public License 
* along with this program; if not, write to the Free Software Foundation, Inc., 
* 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA. 
* 
* Fonte(s): http://www.guj.com.br/java/43875-medir-o-tempo-de-execucao-de-um-metodo
*/
public final class Timer {
     
    public Timer(){
        reset();  
    }
    
    private Date start;
  
    /** 
     * Retorna o número exato de milissegundos desde o temporizador foi iniciado.
     * 
     * @return Number of milliseconds since timer was started. 
     */  
    public long getTime(){  
        Date now = new Date();  
        long millis = (now.getTime() - this.start.getTime());    
        return millis;  
    }  
  
    /** 
     * Reinicia o temporizador.
     */  
    public void reset(){  
        this.start = new Date();
    }  
    
    /** 
     * Retorna uma seqüência de caracteres formatada mostrando o tempo decorrido 
     * desde que a instância foi criada.
     * 
     * @param mili
     * @return Formatted time string. 
     */  
    public String toString(boolean mili){  
        
        long millis = getTime();
        
        long hours = millis / 1000 / 60 / 60;
        millis -= hours * 1000 * 60 * 60;
        
        long minutes = millis / 1000 / 60;
        millis -= minutes * 1000 * 60;
        
        long seconds = millis / 1000;
        millis -= seconds * 1000;
  
        StringBuilder time = new StringBuilder();  
        if(hours > 0){
            time.append(hours).append(":");
        }
        if((hours > 0) && (minutes < 10)){
            time.append("0");
        }
        time.append(minutes).append(":");
        if(seconds < 10){
            time.append("0");
        }
        time.append(seconds);  
  
        if(mili){  
            time.append(":");  
            if(millis < 100){  
                time.append("0");
            }
            if(millis < 10){  
                time.append("0");
            }
            time.append(millis);  
        }   
        return time.toString();  
    }

    @Override  
    public String toString(){  
        return toString(true);  
    }    
}

/**
Timer timer = new Timer();
 //Método..
System.out.println(timer);
*/
