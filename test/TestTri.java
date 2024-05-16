import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;
import donnees.Magasin;
import donnees.CD;


import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTri {

    @Test
    public void testTriArtiste() throws FileNotFoundException{
        ChargeurMagasin cm = new ChargeurMagasin("./src/musicbrainzSimple");
        Magasin m = cm.chargerMagasin();
        m.trierArtiste();
        ArrayList<CD> liste = m.getListeCds();
        assertEquals("Zebda",liste.getLast().getNomArtiste(),"Le dernier artiste doit etre Zebda");
        assertEquals("B" + "\351" + "nabar",liste.getFirst().getNomArtiste(),"Le premier artiste doit etre Bénabar");

    }
    /*
    Second test pas encore réussi
    */
    @Test
    public void testTriAlbum() throws FileNotFoundException{
        ChargeurMagasin cm = new ChargeurMagasin("./src/musicbrainzSimple");
        Magasin m = cm.chargerMagasin();
        m.trierAlbum();
        ArrayList<CD> liste = m.getListeCds();
        assertEquals("Whitney Houston",liste.getLast().getNomCD(),"Le dernier album doit etre Whitney Houston");
        assertEquals("Believe",liste.getFirst().getNomCD(),"Le premier album doit être Believe");

    }
}

