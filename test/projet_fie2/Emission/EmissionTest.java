/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.HoraireException;
import ProgrammeTele.ProgrammeTele;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projet_fie2.Personne.Realisateur;

/**
 *
 * @author mattonhugo
 */
public class EmissionTest {
    
    public EmissionTest() {
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

  
    /**
     * Test of programmerEmission method, of class Emission.
     */
    @Test
    public void testProgrammerEmission() throws Exception {
        int expResult = 1;
        ProgrammeTele programme = new ProgrammeTele();
        Fiction fic = new Fiction(4,"Test",2000,true,new Realisateur("Test","Unitaire"));
        fic.programmerEmission(15, programme);
        assertEquals(expResult, programme.size());
    }
    
    @Test (expected = HoraireException.class) //Pas OK
    public void testProgrammerEmissionDepassement() throws Exception {
        ProgrammeTele programme = new ProgrammeTele();
        Fiction fic = new Fiction(4,"Test",2000,true,new Realisateur("Test","Unitaire"));
        fic.programmerEmission(23, programme);
        fail("Pas d'exception");
    }
    
}
