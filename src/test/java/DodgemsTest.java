import themepark.Visitor;
import themepark.attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        dodgems = new Dodgems("crash", 4);
        visitor1 = new Visitor(1, 9, 1.00, 0.00);
        visitor2 = new Visitor(1, 13, 1.00, 0.00);
    }

    @Test
    public void hasName(){
        assertEquals("crash", dodgems.getName());
    }

    @Test
    public void checkPriceForYoungerVisitor(){
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.01);
    }

    @Test
    public void checkPriceForOlderVisitor(){
        assertEquals(4.50, dodgems.priceFor(visitor2), 0.01);
    }

    @Test
    public void hasRating(){
        assertEquals(4, dodgems.getRating());
    }
}
