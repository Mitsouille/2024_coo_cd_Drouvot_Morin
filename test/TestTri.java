import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;
import donnees.Magasin;


import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTri {

    @Test
    public void testTriAlbum() throws FileNotFoundException{
        ChargeurMagasin cm = new ChargeurMagasin("./src/musicbrainzSimple");
        Magasin m = cm.chargerMagasin();
        m.trierAlbum();



    }
}

