/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.DureeException;
import projet_fie2.Personne.Animateur;

/**
 *
 * @author mattonhugo
 */
public abstract class Divertissement extends Emission{
    
    private Animateur animateur;
    
    public Divertissement(int dureeEmission, String nom, Animateur animateur){
        super(dureeEmission, nom);
        this.animateur = animateur;
        
    }
    
}
