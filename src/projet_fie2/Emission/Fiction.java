/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.HoraireException;
import projet_fie2.Personne.Realisateur;

/**
 *
 * @author mattonhugo
 */
public class Fiction extends Emission{
    
    private int anneRealisation;
    private boolean redifusion;
    private Realisateur realisateur;
    
    public Fiction(int dureeEmission, String nom, int annee, boolean redifusion ,Realisateur realisateur, int heureDebut) throws HoraireException{
        super(dureeEmission, nom, heureDebut);
        this.realisateur = realisateur;
        this.redifusion = redifusion;
        this.anneRealisation = annee;
        
        if (heureDebut != 21 && redifusion==false) {
            throw new HoraireException ("Mauvais crénaud horaire, une fiction peut commencer à 21h.");
        }
        
    }

    @Override
    public String toString() {
        if (redifusion) {
        return "'" + nom + "' heure de diffusion : " + heureDebut + "heure, durée : " + duree + "heures,  Genre : Fiction, annee de realisation :" + anneRealisation + ", " + realisateur + ". Redifusion.";
        } else {
        return "'" + nom + "' heure de diffusion : " + heureDebut + "heure, durée : " + duree + "heures,  Genre : Fiction, annee de realisation :" + anneRealisation + ", " + realisateur;

        }
    }
    
}

