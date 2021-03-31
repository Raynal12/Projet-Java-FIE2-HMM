/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammeTele;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import projet_fie2.Emission.Emission;

/**
 *
 * @author mattonhugo
 */
public class ProgrammeTele extends ArrayList<Emission>{
    
    private boolean[] table;
    private TreeSet<Emission> lesEmissions;
    
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
    
    public void afficherProgramme(){
        lesEmissions = new TreeSet<Emission>();
        
        for (Emission e : this){
           lesEmissions.add(e);
           
        }
        
        for (Emission e : lesEmissions){
           System.out.println(e);
        }
    }
    
    
    
}


