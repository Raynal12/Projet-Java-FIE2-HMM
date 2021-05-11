/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammeTele;

import Exception.ChevauchementException;
import Exception.ProgramationException;
import Exception.TrouException;
import Exception.GrilleValideException;
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
public class ProgrammeTele extends TreeSet<Emission> implements Serializable{
    
    private boolean[] table; //sert pour la vérification de la grille
    private TreeSet<Emission> lesEmissions;//sert pour trier les émissions avant de les afficher 
    private boolean programme_valide = false;
    
    public ProgrammeTele (){
        super();
        this.table = new boolean[24];
        //par sécurité on initialise les cases de notre tableau à false
        for(int i = 0; i <24; i++){
            table[i]=false;
        }
    }
    
    //getter
    public boolean isProgramme_valide() {
        return programme_valide;
    }
    
    /**
     * permet de vérifier la validité de l'objet ProgrammeTélé
     * @throws ChevauchementException
     * @throws TrouException 
     */
    public void verifierProgramme() throws ChevauchementException, TrouException{
        //on reinitialise le tableau de booléen à false par précaution
        for(int i = 0; i <24; i++){
            this.table[i]=false;
        }
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
        //Si tout s'est bien passé on passe l'attribut programme_valide à true
        this.programme_valide = true;
    }

    
    /**
     * permet de sérialiser l'objet courant dans un fichier sous forme binaire
     * @param filePath
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void sauverGrille(String filePath)
            throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this); 
        oos.close();
    }
    
    /**
     * permet de lire les données binaire contenu dans un fichier et retourne l'objet ProgrammeTélé correspondant
     * @param filePath
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static ProgrammeTele lireGrille(String filePath)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ProgrammeTele obj = (ProgrammeTele) ois.readObject();
        ois.close();
        return obj;
    }
    
    
    
}


