/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2;

import Exception.EmissionException;
import Exception.DureeException;
import Exception.HoraireException;
import projet_fie2.Emission.Fiction;
import ProgrammeTele.ProgrammeTele;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_fie2.Emission.Reportage;
import projet_fie2.Emission.ThemeReportage;
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

    public static void main(String[] args) {
        
        Reportage rep = null;
        try{
            rep = new Reportage (1,"Thalassa",ThemeReportage.ANIMALIER,13);
        }catch(EmissionException e){
            System.out.println(e);
        }
        
       
        ProgrammeTele programme = new ProgrammeTele();
        programme.add(rep);

        try {
            System.out.println(new Reportage(1, "Les Lions", ANIMALIER, 15));
        } catch (HoraireException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DureeException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(new Fiction(2, "Avengers", 1920, true, (new Realisateur("Bernard", "Dupont")), 21));
        } catch (HoraireException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(new Divertissement(2, "La Famille Pirate", (new Animateur("Jean", "Dupond")), 19));
        } catch (HoraireException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DureeException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }

        
} 
    
}
    
      
    