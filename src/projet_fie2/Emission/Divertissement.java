/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.HoraireException;
import Exception.DureeException;
import projet_fie2.Personne.Animateur;

/**
 *
 * @author mattonhugo
 */
public class Divertissement extends Emission{
    
    private Animateur animateur;
    
    public Divertissement(int dureeEmission, String nom, Animateur animateur, int heureDebut) throws HoraireException, DureeException{
        super(dureeEmission, nom, heureDebut);
        this.animateur = animateur;
        
        if (heureDebut<18 || heureDebut>23) {
            throw new HoraireException ("Mauvais crénaud horaire, un divertissement peut commencer entre 18h et 23h.");
        }
        
        if (dureeEmission != 2) {
            throw new DureeException ("Durée du divertissement fausse. Elle doit être égale à 2 heures.");
        }
        
    }
    
    public String toString() {
        return "'" + nom + "' Heure début : " + heureDebut + "h, durée : "+ duree + "h. Divertissement, " + animateur;
    }

}
      



