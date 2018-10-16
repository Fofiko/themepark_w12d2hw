import org.junit.Before;
import org.junit.Test;
import stalls.IcecreamStall;

import static org.junit.Assert.assertEquals;

public class IcecreamStallTest {

    IcecreamStall icecreamStall;

    @Before
    public void before(){
        icecreamStall = new IcecreamStall("frozen", "Luca", 1);
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
}
