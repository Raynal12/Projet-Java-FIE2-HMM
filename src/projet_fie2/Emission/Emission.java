/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.HoraireException;
import ProgrammeTele.ProgrammeTele;

/**
 *
 * @author mattonhugo
 */
// petit commentaire pour voir si je peux push Maëlle
public abstract class Emission {
    
    protected int duree;
    protected String nom;
    protected int heureDebut;

    public Emission(int duree, String nom) {
        this.duree = duree;
        this.nom = nom;
        
       
        
    }
    
    public abstract void programmerEmission(int heureDebut,ProgrammeTele programme) throws HoraireException;
    
    @Override
    public String toString() {
        return "Emission : " + nom + ", duree : " + duree + ", heure de debut : " + heureDebut;
    }
}
