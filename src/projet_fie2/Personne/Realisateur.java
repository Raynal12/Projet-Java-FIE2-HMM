/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Personne;

import java.io.Serializable;

/**
 *
 * @author fanta
 */
public class Realisateur extends Personne implements Serializable{

    public Realisateur(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public String toString() {
        return "Realisateur : " + super.toString();
    }
    
    
}
