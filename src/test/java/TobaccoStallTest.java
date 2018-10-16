import org.junit.Before;
import org.junit.Test;
import themepark.Visitor;
import themepark.stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){

        tobaccoStall = new TobaccoStall("TobaccoLand", "Toni", 3);
        visitor = new Visitor(1, 14, 1.75, 50.50);
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

    @Test
    public void checkSecurity(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(6.60, tobaccoStall.defaultPrice(), 0.01);
    }
}

