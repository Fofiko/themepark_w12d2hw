import org.junit.Before;
import org.junit.Test;
import themepark.Visitor;
import themepark.stalls.IcecreamStall;

import static org.junit.Assert.assertEquals;

public class IcecreamStallTest {

    IcecreamStall icecreamStall;
    Visitor visitor;

    @Before
    public void before(){
        icecreamStall = new IcecreamStall("frozen", "Luca", 1, 4);
        visitor = new Visitor(1, 9, 1.00, 0.00);
    }

    @Test
    public void hasName(){
        assertEquals("frozen", icecreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Luca", icecreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, icecreamStall.getParkingSpot());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(2.80, icecreamStall.defaultPrice(), 0.01);
    }

    @Test
    public void hasSameDefaultPriceForEveyone() {
        assertEquals(2.80, icecreamStall.priceFor(visitor), 0.01);
    }

    @Test
    public void hasRating(){
        assertEquals(4, icecreamStall.getRating());
    }
}
