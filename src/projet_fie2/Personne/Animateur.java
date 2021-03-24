/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Personne;

/**
 *
 * @author fanta
 */
public class Animateur extends Personne{

    public Animateur(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public String toString() {
        return "Animateur : " + super.toString();
    }
    
    
}
