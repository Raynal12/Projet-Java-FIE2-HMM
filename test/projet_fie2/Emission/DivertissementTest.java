/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_fie2.Emission;

import Exception.DureeException;
import Exception.HoraireException;
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
    
    //@Test (expected = DureeException.class)//Pas OK
    //public TestDivertissementDureeMauvaise() throws Exception{
        //Divertissement div = new Divertissement(3, "Test", new Animateur("Test", "unitaire"));
        //fail("Une execption de type DureeException aurait dû être levée.");
    //}
    
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
    @Test //OK
    public void testProgrammerEmission() throws Exception {
        System.out.println("testProgrammerEmission");
        int expResult=1;
        ProgrammeTele programme = new ProgrammeTele();
        Divertissement div = new Divertissement(2, "Test", new Animateur("Test", "unitaire"));
        div.programmerEmission(19 , programme);
        //programme.programmerEmission();
        assertEquals(expResult, programme.size());
    }
    
        /**
     * Test of programmerEmission method, of class Divertissement.
     * @throws java.lang.Exception
     */
    @Test (expected = HoraireException.class) //Pas OK -> si heureDebut<18
    public void testProgrammerEmissionHoraireTropTot() throws Exception {
        System.out.println("testProgrammerEmissionTropTot");
        ProgrammeTele programme = new ProgrammeTele();
        Divertissement div = new Divertissement(2, "Test", new Animateur("Test", "unitaire"));
        div.programmerEmission(5 , programme);
        fail("Une execption de type HoraireExeption aurait dû être levée.");
    }
    
    @Test (expected = DureeException.class) // Pas OK
    public void testConstructeurNok() throws Exception{
        System.out.println("test constructeur en erreur");
        Divertissement div = new Divertissement(1, "Test", new Animateur("Test", "unitaire"));
        fail("Constructeur pas en erreur");
    }
    
    @Test //OK
    public void testConstructeurOk() throws Exception {
        System.out.println("test constructeur OK");
        int expResult=2;
        Divertissement div = new Divertissement(2, "Test", new Animateur("Test", "unitaire"));
        assertEquals(expResult, div.getDuree());
}
}