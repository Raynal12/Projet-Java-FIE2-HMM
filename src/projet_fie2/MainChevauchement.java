/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2;

import Exception.ChevauchementException;
import Exception.HoraireException;
import Exception.TrouException;
import ProgrammeTele.ProgrammeTele;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_fie2.Emission.Fiction;
import projet_fie2.Personne.Realisateur;

/**
 *
 * @author mattonhugo
 */
public class MainChevauchement {
    
    public static void main(String[] args) {
        
        ProgrammeTele programme = new ProgrammeTele();
        
        //création des émissions
        Fiction fic1 = new Fiction(13,"Test",2000,true,new Realisateur("Cameron", "James"));
        Fiction fic2 = new Fiction(12,"Test",2000,true,new Realisateur("Cameron", "James"));
        
        //programation des émissions
        try {
            fic1.programmerEmission(0, programme);
        } catch (HoraireException ex) {
            Logger.getLogger(MainChevauchement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            fic2.programmerEmission(11, programme);
        } catch (HoraireException ex) {
            Logger.getLogger(MainChevauchement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //verification programme
        try {
            
            programme.verifierProgramme();
        } catch (ChevauchementException ex) {
            Logger.getLogger(MainChevauchement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TrouException ex) {
            Logger.getLogger(MainChevauchement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
