/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2;


import Exception.DureeException;
import Exception.HoraireException;
import ProgrammeTele.ProgrammeTele;
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

    public static void main(String[] args) {
        
        //craetion programme télé
        ProgrammeTele programme = new ProgrammeTele();
        
        //création d'émission
        Divertissement div1 = null;
        try{
             div1 = new Divertissement(2,"TPMP", new Animateur("Hanouna", "Cyril"));
        }catch(DureeException e){
             System.out.println(e);
        }
        
        Reportage rep1 = null;
        try{
             rep1 = new Reportage(1,"Thalassa",ThemeReportage.ANIMALIER);
        }catch(DureeException e){
             System.out.println(e);
        }
        
        Fiction fic1 = new Fiction(3,"Avengers", 2010, false, new Realisateur("Lewis", "Hamilton"));
        
        //Programation des emissions
        
        try {
            div1.programmerEmission(20, programme);
        } catch (HoraireException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            fic1.programmerEmission(21, programme);
        } catch (HoraireException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            rep1.programmerEmission(15, programme);
        } catch (HoraireException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //verification
        System.out.println(programme.size());
        
        
        
    } 
    
}
    
      
    