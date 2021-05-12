/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2;


import Exception.ChevauchementException;
import Exception.DureeException;
import Exception.GrilleValideException;
import Exception.HoraireException;
import Exception.ProgramationException;
import Exception.TrouException;
import ProgrammeTele.ProgrammeTele;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_fie2.Emission.Divertissement;
import projet_fie2.Emission.Fiction;
import projet_fie2.Emission.Reportage;
import projet_fie2.Emission.ThemeReportage;
import projet_fie2.Personne.Animateur;
import projet_fie2.Personne.Realisateur;


/**
 *
 * @author fanta
 */
public class Projet_FIE2 {

    public static void main(String[] args) throws GrilleValideException, HoraireException {
        
        //creation d'un programme
        System.out.println("Creation d'un programme");
        ProgrammeTele programme = new ProgrammeTele();
        //creation d'une fiction 1 de 12h 
        System.out.println("Creation d'une fiction (Avatar)");
        Fiction fic1 = new Fiction(12,"Avatar",2000,true,new Realisateur("James","Cameron"));
        //creation d'une fiction 2 de 12h 
        System.out.println("Creation d'une fiction (Avatar)");
        Fiction fic2 = new Fiction(12,"Terminator",2000,true,new Realisateur("James","Cameron"));
        
        //programation de la fiction 1 dans programme à 0h
        fic1.programmerEmission(0, programme);
        System.out.println("programation de la fiction dans programme");
        //programation de la fiction 2 dans programme à 0h
        fic2.programmerEmission(12, programme);
        System.out.println("programation de la fiction dans programme");
        //verification de la validité du programme
        try {
            programme.verifierProgramme();
            System.out.println("Le programme est : " + programme.isProgramme_valide());
        } catch (ChevauchementException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TrouException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }
        //affichage du programme selo si il est valide ou non
        if (programme.isProgramme_valide()){
            System.out.println("Affichage programme : ");
            System.out.println(programme);
        }
        else
            System.out.println("le programme n'est pas valide et ne eut pas être affiché");
        
        //sauvegarde du programme
        try {
            programme.sauverGrille("sauvegarde");
            System.out.println("Programme sauvegardé dans fichier sauvegarde");
        } catch (IOException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //recuperation du programme
            ProgrammeTele programm_recup = ProgrammeTele.lireGrille("sauvegarde");
            System.out.println("Programme récupéré depuis le fichier sauvegarde");
            System.out.println("Affichage du programme récupéré :");
            System.out.println(programm_recup);
        } catch (IOException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    
}
    
      
    