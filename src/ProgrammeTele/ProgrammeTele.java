/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammeTele;

import Exception.ChevauchementException;
import Exception.TrouException;
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
        this.table = new boolean[24];
        for(int i = 0; i <24; i++){
            table[i]=false;
        }
    }
    
    public void verifierProgramme() throws ChevauchementException, TrouException{
        //verification des chevauchements
        for (Emission e : this){
            for (int i = e.getHeureDebut(); i < e.getHeureDebut()+ e.getDuree(); i++){
                if (this.table[i] == false)
                    this.table[i] = true;
                else
                    throw new ChevauchementException("chevauchement à "+i+"h avec emission "+e);
            }
        }
        //verification des trous
        for (int i = 0; i < 24; i++){
            if (!table[i]){
                throw new TrouException("Aucune émission de programmée à : "+8+"h");
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


