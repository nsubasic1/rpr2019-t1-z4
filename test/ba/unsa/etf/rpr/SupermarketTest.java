package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void testDodajArtikl() {
        Supermarket novi = new Supermarket();
        novi.dodajArtikl(new Artikl("jaja", 2, "123"));
        assertEquals(1, novi.getVel());
    }

    @Test
    void testIzbaciArtiklSaKodom() {
        Supermarket nova = new Supermarket();
        for(int i = 0; i<10; i++) nova.dodajArtikl(new Artikl("lopta", 4, String.valueOf(i)));
        Artikl izbaceni =nova.izbaciArtiklSaKodom("5");
        assertEquals("5", izbaceni.getKod());
    }
}