/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2;

import Exception.ChevauchementException;
import Exception.GrilleValideException;
import Exception.HoraireException;
import Exception.ProgramationException;
import Exception.TrouException;
import ProgrammeTele.ProgrammeTele;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_fie2.Emission.Fiction;
import projet_fie2.Personne.Realisateur;

/**
 *
 * @author mattonhugo
 */
public class MainOk {
    
    public static void main(String[] args) throws GrilleValideException {
      
        ProgrammeTele programme = new ProgrammeTele();
        System.out.println("Creation programme");
        
        Fiction fic1 = new Fiction(12,"Avatar",2000,true,new Realisateur("James", "Cameron"));
        System.out.println("Creation fic1");
        
        Fiction fic2 = new Fiction(12,"Avatar",2000,true,new Realisateur("James", "Cameron"));
        System.out.println("Creation fic2");
        
        try {
            fic1.programmerEmission(0, programme);
            System.out.println("Programation fic1 dans programme");
        } catch (HoraireException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fic2.programmerEmission(12, programme);
            System.out.println("Programation fic1 dans programme");
        } catch (HoraireException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            programme.verifierProgramme();
            System.out.println(programme.isProgramme_valide());
        } catch (ChevauchementException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TrouException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        try {
            programme.sauverGrille("sauvegarde");
            System.out.println("Sauvegarde fic1");
        } catch (IOException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ProgrammeTele programme_save = null;
        try {
            programme_save = ProgrammeTele.lireGrille("sauvegarde");
            System.out.println("Lecture fic 1 et creation d'un nouveau programme");
        } catch (IOException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            programme_save.verifierProgramme();
        } catch (ChevauchementException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TrouException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            programme_save.TrierProgramme().toString();
        } catch (ProgramationException ex) {
            Logger.getLogger(MainOk.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
