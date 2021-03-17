/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Grille;

import java.util.ArrayList;
import projet_fie2.Emission.Emission;

/**
 *
 * @author mattonhugo
 */
public class Grille {
    
    ArrayList<Emission> lesEmissions;
    private int[] table;
    
    public Grille (){
        this.table = new int[23];
        this.lesEmissions = new ArrayList<>();
    }
    
    
}


