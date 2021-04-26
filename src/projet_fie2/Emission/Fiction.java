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
        return super.toString() + "-Année : "+anneRealisation+" -Redifusion : "+redifusion + realisateur.toString();
    }
    
    /**
     * Permet de programmer à une un horaire de diffusion précise un objet de type Fiction dans un objet de type ProgrammeTélé .
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
            throw new HoraireException ("Une fiction qui n'est pas une redifusion ne peut commencer qu'à 21h.");
        }
        programme.add(this);
        this.heureDebut = heureDebut;
        
    }
    
}

