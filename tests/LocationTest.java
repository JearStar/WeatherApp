import JSON.JSONParser;
import model.Location;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.main;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {
    Location testLocation;


    @BeforeEach
    void setup() {

        try {
            testLocation =
                    new Location(JSONParser.readJsonFromUrl("http://api.weatherapi.com/v1/current.json?key=" + main.API_KEY +
                    "&q=Coquitlam&days=1&aqi=yes&alerts=yes"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testGetters() {
        assertEquals(testLocation.getName(), "Coquitlam");
        assertEquals(testLocation.getRegion(), "British Columbia");
        assertEquals(testLocation.getCountry(), "Canada");
        DecimalFormat def = new DecimalFormat("#.##");
        def.setRoundingMode(RoundingMode.HALF_UP);
//        assertEquals(Float.parseFloat(def.format(testLocation.getLat())) , 49.27);
//        assertEquals(Float.parseFloat(def.format(testLocation.getLon())) , -122.78);
        assertEquals(testLocation.getTzId(), "America/Vancouver");

    }

}
