package ro.ase.cts.clase;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testGetGen() {
        IPersoana persoana = new Persoana("Matei", "12345632");
        Assert.assertEquals("M", persoana.getGen());
    }

    @Test
    public void testGetGenDupa2000(){
        IPersoana personaj = new Persoana("Bianca", "65323231");
        assertEquals("greseala","F", personaj.getGen());
    }

    @Test
    public void testCheckCNP(){
        Persoana persoana = new Persoana("Matei", "1900324415752");
        assertTrue(persoana.checkCNP()); // ac lucru cu assertEquals
        assertEquals(true, persoana.checkCNP());
    }

    @Test
    public void testGenPersoanaBoundaryInferior2000(){
        Persoana persoana2 = new Persoana("Mircea", "5000101232133");
        Assert.assertEquals("M", persoana2.getGen());
    }

    @Test
    public void testGetVarstaPersoanaNascutaAzi(){
        Persoana persoana3 = new Persoana("Mihai","52605142321312");
        Assert.assertEquals(0, persoana3.getVarsta());
    }

    @Test
    public void testGetGenCrossCheck(){
        Persoana persoana23 = new Persoana("Biancut", "6231231321312");
        String CNP = "6231231321312";
        String expected;
        if(CNP.charAt(0) % 2 == 0){
            expected = "F";
        } else {
            expected = "M";
        }
        String actual = persoana23.getGen();
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckLungimeCnp(){
        Persoana personajul = new Persoana("Stefanel", "12345677");
        personajul.checkCNP();
    }
}