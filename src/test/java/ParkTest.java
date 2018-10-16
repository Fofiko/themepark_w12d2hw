import themepark.attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("GreenGrass", 4);
    }

    @Test
    public void hasName(){
        assertEquals("GreenGrass", park.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(4, park.getRating());
    }
}
