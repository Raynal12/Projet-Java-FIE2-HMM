/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.HoraireException;
import ProgrammeTele.ProgrammeTele;
import projet_fie2.Personne.Realisateur;

/**
 *
 * @author mattonhugo
 */
public class Fiction extends Emission{
    
    private int anneRealisation;
    private boolean redifusion;
    private Realisateur realisateur;
    
    public Fiction(int dureeEmission, String nom, int annee, boolean redifusion ,Realisateur realisateur){
        super(dureeEmission, nom);
        this.realisateur = realisateur;
        this.redifusion = redifusion;
        this.anneRealisation = annee;
        
    }

    @Override
    public String toString() {
        if (redifusion) {
        return "'" + nom + "' Heure de diffusion : " + heureDebut + "h, durée : " + duree + "h. Fiction, redifusion. Annee de realisation :" + anneRealisation + ", " + realisateur;
        } else {
        return "'" + nom + "' Heure de diffusion : " + heureDebut + "h, durée : " + duree + "h. Fiction, annee de realisation :" + anneRealisation + ", " + realisateur;

        }
    }
    
    public void programmerEmission(int heureDebut,ProgrammeTele programme) throws HoraireException{
        programme.add(this);
        this.heureDebut = heureDebut;
        if (heureDebut != 21 && redifusion==false) {
            throw new HoraireException ("Mauvais crénaud horaire, une fiction peut commencer à 21h.");
        }
        
    }
    
}

