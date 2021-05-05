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
public class FictionTest {
    
    public FictionTest() {
        
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
     * Test of programmerEmission method, of class Fiction.
     */
    @Test
    public void testProgrammerEmission() throws Exception {
        int expResult = 1;
        ProgrammeTele programme = new ProgrammeTele();
        Fiction fic = new Fiction(3,"Avatar",2010,true,new Realisateur("Test","Unitaire"));
        fic.programmerEmission(0, programme);
        assertEquals(expResult, programme.size());
    }
    
    @Test (expected = HoraireException.class)
    public void testProgrammerEmissionHorraireMauvais() throws Exception {
        //on programme une fiction qui n'est pas une redifusion à une autre heure que 21h
        ProgrammeTele programme = new ProgrammeTele();
        Fiction fic = new Fiction(3,"Avatar",2010,false,new Realisateur("Test","Unitaire"));
        fic.programmerEmission(0, programme);
        fail("Une émission de type HoraireException aurait du être levé");
    }
    
}
