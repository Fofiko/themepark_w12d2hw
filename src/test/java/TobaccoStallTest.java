import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("TobaccoLand", "Toni", 3);
    }

    @Test
    public void hasName(){
        assertEquals("TobaccoLand", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Toni", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, tobaccoStall.getParkingSpot());
    }
}

