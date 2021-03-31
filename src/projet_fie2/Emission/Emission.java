/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.HoraireException;
import ProgrammeTele.ProgrammeTele;
import java.util.Objects;

/**
 *
 * @author mattonhugo
 */
// petit commentaire pour voir si je peux push Maëlle
public abstract class Emission implements Comparable <Emission> {
    
    protected int duree;
    protected String nom;
    protected int heureDebut;

    public Emission(int duree, String nom) {
        this.duree = duree;
        this.nom = nom;
        
       
        
    }
    
    public abstract void programmerEmission(int heureDebut,ProgrammeTele programme) throws HoraireException;
    
    @Override
    public String toString() {
        return "Emission : " + nom + ", duree : " + duree + ", heure de debut : " + heureDebut;
    }

    @Override
    public int compareTo(Emission emi) {
        int ret = 0;
        if (this.heureDebut < emi.heureDebut )   
            ret = 1;
        if (this.heureDebut > emi.heureDebut )   
            ret = -1;
        
       if (this.heureDebut == emi.heureDebut )   
            ret = this.nom.compareTo(emi.nom);
       return ret;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.duree;
        hash = 89 * hash + Objects.hashCode(this.nom);
        hash = 89 * hash + this.heureDebut;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emission other = (Emission) obj;
        if (this.duree != other.duree) {
            return false;
        }
        if (this.heureDebut != other.heureDebut) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    
}
