/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2;

import Exception.HoraireException;
import projet_fie2.Emission.Fiction;
import ProgrammeTele.ProgrammeTele;
import java.util.logging.Level;
import java.util.logging.Logger;
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
       
        try {
            Fiction fiction1 = new Fiction (2, "Avengers", 2004, false, new Realisateur("Paul", "Dulin"), 21);
            System.out.println(fiction1);
        } catch (HoraireException ex) {
            Logger.getLogger(Projet_FIE2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
