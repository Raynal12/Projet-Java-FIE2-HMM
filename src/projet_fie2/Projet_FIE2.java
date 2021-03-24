/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2;

import Exception.DureeException;
import Exception.HoraireException;
import projet_fie2.Emission.Fiction;
import ProgrammeTele.ProgrammeTele;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_fie2.Emission.Divertissement;
import projet_fie2.Emission.Reportage;
import static projet_fie2.Emission.ThemeReportage.ANIMALIER;
import projet_fie2.Personne.Animateur;
import projet_fie2.Personne.Realisateur;

/**
 *
 * @author fanta
 */
public class Projet_FIE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HoraireException, DureeException {
       
        ArrayList<String> array = new ArrayList<>();
      
        //new Livre("Le cid", "corneille", 11, 245
                //Reportage : int dureeEmission, String nom, ThemeReportage theme, int heureDebut 
                //Fiction : int dureeEmission, String nom, int annee, boolean redifusion ,Realisateur realisateur, int heureDebut
                //Divertissement : int dureeEmission, String nom, Animateur animateur, int heureDebut
                
        System.out.println(new Reportage(1, "Les Lions", ANIMALIER, 15));
        System.out.println(new Fiction(2, "Avengers", 1920, true, (new Realisateur("Bernard", "Dupont")), 21));
        System.out.println(new Divertissement(2, "La Famille Pirate", (new Animateur("Jean", "Dupond")), 19));
    }
    
}
