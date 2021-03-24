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
import projet_fie2.Emission.Reportage;
import static projet_fie2.Emission.ThemeReportage.ANIMALIER;
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
                //int dureeEmission, String nom, ThemeReportage theme, int heureDebut 
                //int dureeEmission, String nom, int annee, boolean redifusion ,Realisateur realisateur, int heureDebut
                
        new Reportage(1, "Les Lions", ANIMALIER, 14);
        new Fiction(2, "Avengers", 1920, false, (new Realisateur("Bernard", "Dupont")), 10);
    }
    
}
