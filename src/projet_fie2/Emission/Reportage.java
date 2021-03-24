/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.DureeException;
import Exception.HoraireException;

/**
 *
 * @author mattonhugo
 */
public class Reportage extends Emission{
    
    private ThemeReportage theme;
    
    public Reportage(int dureeEmission, String nom, ThemeReportage theme, int heureDebut ) throws HoraireException, DureeException{
        super(dureeEmission, nom, heureDebut);
        this.theme = theme;
    
    
    if (heureDebut>=18) {
        if (heureDebut>=6 && heureDebut<=14) {
            throw new HoraireException ("Mauvais crénaud horaire, un reportage peut commencer entre 14h et 18h ou entre 0h et 6h.");
        }
    }
    
    if (dureeEmission > 1) {
        throw new DureeException ("Durée du reportage fausse. Il ne peut pas excéder 1 heure.");
    }
    
    }

    @Override
    public String toString() {
        return "Reportage, theme : " + theme;
    }
    
}
