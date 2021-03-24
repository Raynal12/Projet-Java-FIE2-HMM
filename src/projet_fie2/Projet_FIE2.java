/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2;

import Exception.EmissionException;
import Exception.HoraireException;
import projet_fie2.Emission.Fiction;
import ProgrammeTele.ProgrammeTele;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_fie2.Emission.Reportage;
import projet_fie2.Emission.ThemeReportage;
import projet_fie2.Personne.Realisateur;

/**
 *
 * @author fanta
 */
public class Projet_FIE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Reportage rep = null;
        try{
            rep = new Reportage (2,"Thalassa",ThemeReportage.ANIMALIER,13);
        }catch(EmissionException e){
            System.out.println(e);
        }
        
       
        ProgrammeTele programme = new ProgrammeTele();
        programme.add(rep);
        
        
      
    }
    
}
