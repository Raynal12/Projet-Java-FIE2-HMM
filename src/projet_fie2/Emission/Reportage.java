/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

/**
 *
 * @author mattonhugo
 */
public class Reportage extends Emission{
    
    private ThemeReportage theme;
    
    public Reportage(int dureeEmission, String nom, ThemeReportage theme ) {
        super(dureeEmission, nom);
        this.theme = theme;
    }
    
}
