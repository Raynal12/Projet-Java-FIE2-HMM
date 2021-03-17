/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import projet_fie2.Personne.Realisateur;

/**
 *
 * @author mattonhugo
 */
public class Fiction extends Emission{
    
    private int anneRealisation;
    private boolean redifusion;
    private Realisateur realisateur;
    
    public Fiction(int dureeEmission, String nom, int annee, boolean redifusion ,Realisateur realisateur) {
        super(dureeEmission, nom);
        this.realisateur = realisateur;
        this.redifusion = redifusion;
        this.anneRealisation = annee;
    }
    
}
