/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammeTele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    /**
     * Test of verifierProgramme method, of class ProgrammeTele.
     */
    @Test
    public void testVerifierProgramme() throws Exception {
        System.out.println("verifierProgramme");
        ProgrammeTele instance = new ProgrammeTele();
        instance.verifierProgramme();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficherProgramme method, of class ProgrammeTele.
     */
    @Test
    public void testAfficherProgramme() {
        System.out.println("afficherProgramme");
        ProgrammeTele instance = new ProgrammeTele();
        instance.afficherProgramme();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sauverGrille method, of class ProgrammeTele.
     */
    @Test
    public void testSauverGrille() throws Exception {
        System.out.println("sauverGrille");
        String filePath = "";
        ProgrammeTele instance = new ProgrammeTele();
        instance.sauverGrille(filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lireGrille method, of class ProgrammeTele.
     */
    @Test
    public void testLireGrille() throws Exception {
        System.out.println("lireGrille");
        String filePath = "";
        ProgrammeTele expResult = null;
        ProgrammeTele result = ProgrammeTele.lireGrille(filePath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
