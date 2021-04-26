/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.DepassementGrilleException;
import Exception.HoraireException;
import Exception.DureeException;
import ProgrammeTele.ProgrammeTele;
import java.util.logging.Level;
import java.util.logging.Logger;
import projet_fie2.Personne.Animateur;

/**
 *
 * @author mattonhugo
 */
public class Divertissement extends Emission{
    
    private Animateur animateur;
    
    public Divertissement(int dureeEmission, String nom, Animateur animateur) throws  DureeException{
        super(dureeEmission, nom);
        this.animateur = animateur;
        
        if (dureeEmission != 2) {
            throw new DureeException ("La durée d'un divertissement doit être égale à 2h.");
        }
    }
    
    public String toString() {
        return super.toString()+ animateur.toString();
    }
    
    /**
     * Permet de programmer à une un horaire de diffusion précise un objet de type Divertissement dans un objet de type ProgrammeTélé
     * @param heureDebut
     * @param programme
     * @throws HoraireException 
     */
    public void programmerEmission(int heureDebut,ProgrammeTele programme) throws HoraireException{
        try {
            super.programmerEmission(heureDebut, programme);
        } catch (DepassementGrilleException ex) {
            Logger.getLogger(Fiction.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (heureDebut<18 || heureDebut>23) {
            throw new HoraireException ("Horaire invalide, un divertissement peut commencer entre 18h et 23h.");
        }
        programme.add(this);
        this.heureDebut = heureDebut;
        
    }

}
      



