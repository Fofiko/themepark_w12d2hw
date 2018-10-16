import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;

import static org.junit.Assert.assertEquals;

public class CandyflossStallTest {

    CandyflossStall candyflossStall;

    @Before
    public void before(){
        candyflossStall = new CandyflossStall("CandyLand", "Flossy", 2);
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
}
