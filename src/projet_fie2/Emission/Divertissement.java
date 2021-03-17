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
public abstract class Divertissement extends Emission{
    
    private Animateur animateur;
    
    public Divertissement(int dureeEmission, String nom, Animateur animateur, int heureDebut) throws HoraireException{
        super(dureeEmission, nom, heureDebut);
        this.animateur = animateur;
        if (heureDebut<18 || heureDebut>23) {
            throw new HoraireException ("Mauvais crénaud horaire, un divertiqqement peut commencer entre 18h et 23h.");
        }
    }
    
    public String toString() {
        return "Divertissement," + "animateur=" + animateur;
    }

}
      



