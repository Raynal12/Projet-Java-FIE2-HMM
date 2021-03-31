/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammeTele;

import java.util.ArrayList;
import projet_fie2.Emission.Emission;

/**
 *
 * @author mattonhugo
 */
public class ProgrammeTele extends ArrayList<Emission>{
    
    private boolean[] table;
    
    public ProgrammeTele (){
        super();
        this.table = new boolean[23];
    }
    
    public void verifierProgramme(){
        for (Emission e : this){
            if(table[e.getHeureDebut()] = true){
                //genere exception chevauchement
            }
            else{
                table[e.getHeureDebut()] = true;
            }  
        }
        
    }
    
    
}


