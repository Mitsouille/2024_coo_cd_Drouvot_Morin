import XML.ChargeurMagasin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagasin {
    public void test_chargerMagasin(){
        boolean exception = false;
        try{
            ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple");
            cm.chargerMagasin();
        }catch (FileNotFoundException e){
            exception = true;
        }
        assertEquals(false,exception,"Aucune exception devrait etre levée");
    }

    public void test_repInexistantChargerMagasin(){
        boolean exception = false;
        try{
            ChargeurMagasin cm = new ChargeurMagasin("poulet");
            cm.chargerMagasin();
        }catch (FileNotFoundException e){
            exception = true;
        }
        assertEquals(true, exception, "une exception doit etre levée");
    }
}
