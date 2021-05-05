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
import static projet_fie2.Emission.ThemeReportage.ANIMALIER;

/**
 *
 * @author Maëlle
 */
public class ReportageTest {
    
    public ReportageTest() {
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
     * Test of programmerEmission method, of class Reportage.
     */
    @Test
    public void testProgrammerEmission() throws Exception {
        int expResult = 1 ;
        ProgrammeTele programme = new ProgrammeTele();
        Reportage rep = new Reportage(1,"Le lapin bélier",ANIMALIER);
        rep.programmerEmission(2, programme);
       assertEquals(expResult, programme.size());
    
    }
    
    @Test (expected = DureeException.class)
    public void testConstructeurDureeFausse() throws Exception {
        // on teste si la duréee excède 1h
        ProgrammeTele programme = new ProgrammeTele();
        Reportage rep = new Reportage(2,"Le lapin bélier",ANIMALIER);
        rep.programmerEmission(2, programme);
        fail ("Une émission de type DureeException aurait du être levé");
          
    }
    
    @Test (expected = HoraireException.class)
    public void testProgrammerEmissionHoraireFaux() throws Exception {
        // on teste  si l'horaire de programmation est programmé durant les heures creuses
        ProgrammeTele programme = new ProgrammeTele();
        Reportage rep = new Reportage(1,"Le lapin bélier",ANIMALIER);
        rep.programmerEmission(12, programme);
        fail ("Une émission de type HoraireException aurait du être levé");
    }
}
