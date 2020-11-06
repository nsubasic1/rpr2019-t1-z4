package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    /*@BeforeEach{
        Korpa nova = new Korpa();
    }*/
    @Test
    void testMetodeDodajArtikl() {
        Korpa nova = new Korpa();
        nova.dodajArtikl(new Artikl("sveska", 5, "12345"));
        assertEquals(1,nova.getVel());
    }
    @Test
    void testDodajArtiklPrevise(){
        Korpa nova = new Korpa();
        for(int i = 0; i<50; i++) nova.dodajArtikl(new Artikl("lopta", 4, String.valueOf(i)));
        boolean rez = nova.dodajArtikl(new Artikl("sss", 8, "111"));
        assertFalse(rez);
    }
    @Test
    void testIzbaciArtiklSaKodom() {
        Korpa nova = new Korpa();
        for(int i = 0; i<10; i++) nova.dodajArtikl(new Artikl("lopta", 4, String.valueOf(i)));
        Artikl izbaceni =nova.izbaciArtiklSaKodom("5");
        assertEquals("5", izbaceni.getKod());
    }
}