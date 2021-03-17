/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.HoraireException;

/**
 *
 * @author mattonhugo
 */
public class Reportage extends Emission{
    
    private ThemeReportage theme;
    
    public Reportage(int dureeEmission, String nom, ThemeReportage theme, int heureDebut ) throws HoraireException{
        super(dureeEmission, nom, heureDebut);
        this.theme = theme;
    
    
    if ((heureDebut<14 || heureDebut>18) || heureDebut>6) {
            throw new HoraireException ("Mauvais crénaud horaire, un divertiqqement peut commencer entre 14h et 18h ou entre 0h et 6h.");
        }
    
    
    }

    @Override
    public String toString() {
        return "Reportage, theme : " + theme;
    }
    
}
