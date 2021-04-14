/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammeTele;

import Exception.ChevauchementException;
import Exception.TrouException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import projet_fie2.Emission.Emission;

/**
 *
 * @author mattonhugo
 */
public class ProgrammeTele extends ArrayList<Emission> implements Serializable{
    
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
    
    public void sauverGrille(String filePath)
            throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this); 
        oos.close();
    }
    
    public static ProgrammeTele lireGrille(String filePath)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ProgrammeTele obj = (ProgrammeTele) ois.readObject();
        ois.close();
        return obj;
    }
    
    
    
}


