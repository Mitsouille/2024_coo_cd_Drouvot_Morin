import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagasin {
    @Test
    public void test_chargerMagasin(){
        boolean exception = false;
        try{
            ChargeurMagasin cm = new ChargeurMagasin("../src/musicbrainzSimple/");
            cm.chargerMagasin();
        }catch (Exception e){
            exception = true;
        }
        assertEquals(false,exception,"Aucune exception devrait etre levée");
    }

    @Test
    public void test_repInexistantChargerMagasin(){
        boolean exception = false;
        try{
            ChargeurMagasin cm = new ChargeurMagasin("poulet");
            cm.chargerMagasin();
        }catch (Exception e){
            exception = true;
        }
        assertEquals(true, exception, "une exception doit etre levée");
    }
}
