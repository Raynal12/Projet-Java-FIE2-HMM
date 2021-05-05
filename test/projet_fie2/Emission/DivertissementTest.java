/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import ProgrammeTele.ProgrammeTele;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projet_fie2.Personne.Animateur;

/**
 *
 * @author fanta
 */
public class DivertissementTest {
    
    public DivertissementTest() {
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
     * Test of programmerEmission method, of class Divertissement.
     */
    @Test
    public void testProgrammerEmission() throws Exception {
        ProgrammeTele programme = new ProgrammeTele();
        Divertissement div = new Divertissement(2, "Test", new Animateur("Test", "unitaire"));
        div.programmeEmission(19 , programme);
        programme.programmerEmission();
    }
    
        /**
     * Test of programmerEmission method, of class Divertissement.
     */
    @Test
    public void testProgrammerEmission() throws Exception {
        System.out.println("programmerEmission");
        int heureDebut = 0;
        ProgrammeTele programme = null;
        Divertissement instance = null;
        instance.programmerEmission(heureDebut, programme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
