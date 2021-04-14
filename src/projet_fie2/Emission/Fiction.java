/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.DepassementGrilleException;
import Exception.HoraireException;
import ProgrammeTele.ProgrammeTele;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    /**
     * Permet de programmer un horaire de diffusion.
     * @param heureDebut horaire de diffusion
     * @param programme le programme auquel associer la fiction
     * @throws HoraireException si horaire invalide
     */
    public void programmerEmission(int heureDebut,ProgrammeTele programme) throws HoraireException{
        try {
            super.programmerEmission(heureDebut, programme);
        } catch (DepassementGrilleException ex) {
            Logger.getLogger(Fiction.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (heureDebut != 21 && redifusion==false) {
            throw new HoraireException ("Mauvais crénaud horaire, une fiction qui n'est pas une redifusion ne peut commencer qu'à 21h.");
        }
        programme.add(this);
        this.heureDebut = heureDebut;
        
    }
    
}

