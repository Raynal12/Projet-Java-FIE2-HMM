/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import ProgrammeTele.ProgrammeTele;

/**
 *
 * @author mattonhugo
 */
public class Emission {
    
    protected int duree;
    protected String nom;
    protected int heureDebut;

    public Emission(int duree, String nom, int heureDebut) {
        this.duree = duree;
        this.nom = nom;
        this.heureDebut = heureDebut;
       
        
    }

    @Override
    public String toString() {
        return "Emission : " + nom + ", duree : " + duree + ", heure de debut : " + heureDebut;
    }
}
