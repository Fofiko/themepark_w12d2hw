import org.junit.Before;
import org.junit.Test;
import themepark.Visitor;
import themepark.stalls.CandyflossStall;

import static org.junit.Assert.assertEquals;

public class CandyflossStallTest {

    CandyflossStall candyflossStall;
    Visitor visitor;

    @Before
    public void before(){
        candyflossStall = new CandyflossStall("CandyLand", "Flossy", 2, 4);
        visitor = new Visitor(1, 14, 1.75, 50.50);
    }

    @Test
    public void hasName(){
        assertEquals("CandyLand", candyflossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Flossy", candyflossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(2, candyflossStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.20, candyflossStall.defaultPrice(), 0.01);
    }

    @Test
    public void hasSameDefaultPriceForEveyone() {
        assertEquals(4.20, candyflossStall.priceFor(visitor), 0.01);
    }

    @Test
    public void hasRating(){
        assertEquals(4, candyflossStall.getRating());
    }
}
