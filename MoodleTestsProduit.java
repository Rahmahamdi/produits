import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodleTestsProduit
{
    @Test
    public void testGetters()
    {
        Produit cerise = new Produit("Cerise", 10, 12), citron = new Produit("Citron", 20, 22);
        assertEquals("Cerise", cerise.getNom());
        assertEquals("Citron", citron.getNom());
        assertEquals(10, cerise.getVentesEnLigne());
        assertEquals(12, cerise.getVentesBoutique());
        assertEquals(20, citron.getVentesEnLigne());
        assertEquals(22, citron.getVentesBoutique());
    }

    @Test
    public void testSetters()
    {
        Produit cerise = new Produit("", 0, 0), citron = new Produit("", 0, 0);
        cerise.setNom("Cerise");
        citron.setNom("Citron");
        cerise.setVentesBoutique(10);
        citron.setVentesBoutique(12);
        cerise.setVentesEnLigne(20);
        citron.setVentesEnLigne(22);
        assertEquals("Cerise", cerise.getNom());
        assertEquals("Citron", citron.getNom());
        assertEquals(10, cerise.getVentesBoutique());
        assertEquals(12, citron.getVentesBoutique());
        assertEquals(20, cerise.getVentesEnLigne());
        assertEquals(22, citron.getVentesEnLigne());
    }

    @Test
    public void testTotalVentes()
    {
        Produit cerise = new Produit("Cerise", 13, 23), citron = new Produit("Citron", 51, 57);
        assertEquals(36, cerise.totalVentes());
        assertEquals(108, citron.totalVentes());
    }

    @Test
    public void testCopie()
    {
        Produit cerise = new Produit("Cerise", 13, 23), autreCerise = cerise.copie();
        assertFalse(cerise == autreCerise);
        assertEquals("Cerise", cerise.getNom());
        assertEquals(13, cerise.getVentesEnLigne());
        assertEquals(23, cerise.getVentesBoutique());
        assertEquals("Cerise", autreCerise.getNom());
        assertEquals(0, autreCerise.getVentesBoutique());
        assertEquals(0, autreCerise.getVentesEnLigne());
    }

    @Test
    public void testCompare()
    {
        Produit cerise = new Produit("Cerise", 5, 12), citron = new Produit("Citron", 3, 13);
        assertTrue(cerise.compare(citron) > 0);
        assertTrue(citron.compare(cerise) < 0);
        assertTrue(citron.compare(citron) == 0);
    }
}
