/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammeTele;

import Exception.ChevauchementException;
import Exception.HoraireException;
import Exception.TrouException;
import Exception.GrilleValideException;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.ValidationException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projet_fie2.Emission.Emission;
import projet_fie2.Emission.Fiction;
import projet_fie2.Personne.Realisateur;

/**
 *
 * @author mattonhugo
 */
public class ProgrammeTeleTest {
    
    public ProgrammeTeleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    Quand on met Try Catch --> Bug
    Quand on met Throws Exception --> OK 
    
    expected --> Comment on met plusieurs exception dans la clause ? 
    
    commment on teste les méthodes de sauvegarde ? 
    
    On doit tester méthode programmerEmission de la super classe emission ?
    */
    
    /**
     * Test of verifierProgrammeChevauchement method, of class ProgrammeTele.
     */
    @Test 
    public void testVerifierProgramme() throws Exception{
        boolean expResult = true;
        //creation d'une grille d'emission correcte
        ProgrammeTele programme = new ProgrammeTele();
        Fiction fic1 = new Fiction(12,"Avatar",2000,true,new Realisateur("James", "Cameron"));
        Fiction fic2 = new Fiction(12,"Avatar",2000,true,new Realisateur("James", "Cameron"));
        fic1.programmerEmission(0, programme);
        fic2.programmerEmission(12, programme);
        programme.verifierProgramme();
        //Verification que la grille passe avec succès Programme_valide()
        assertEquals(expResult, programme.isProgramme_valide());
    }
    
    /**
     * Test of verifierProgrammeChevauchement method, of class ProgrammeTele.
     */
    @Test (expected = ChevauchementException.class)
    public void testVerifierProgrammeChevauchement() throws Exception{
        //creation d'une grille d'emission devant générer un ChevauchementException
        ProgrammeTele programme = new ProgrammeTele();
        Fiction fic1 = new Fiction(12,"Test",2000,true,new Realisateur("Test", "Test"));
        Fiction fic2 = new Fiction(13,"Test",2000,true,new Realisateur("Test", "Test"));
        fic1.programmerEmission(0, programme);
        fic2.programmerEmission(11, programme);
        //Verification d'une grille avec un chevauchement
        programme.verifierProgramme();
        fail("On aurait du avoir une exception de type ChevauchementException");
        
    }
    
    /**
     * Test of verifierProgrammeTrou method, of class ProgrammeTele.
     */
    @Test (expected = TrouException.class)
    public void testVerifierProgrammeTrou() throws Exception {
        //verification d'une grille avec des trous
        ProgrammeTele programme = new ProgrammeTele();
        Fiction fic1 = new Fiction(1,"Test",2000,true,new Realisateur("Test", "Test"));
        fic1.programmerEmission(0, programme);
        programme.verifierProgramme();
        fail("On aurait du avoir une exception de type TrouException");
    }

    /**
     * Test of sauverGrille method, of class ProgrammeTele.
     */
    @Test
    public void testSauverGrille() throws Exception {
        
    }

    /**
     * Test of lireGrille method, of class ProgrammeTele.
     */
    @Test 
    public void testLireGrille() throws Exception {
        
    }
    
}
