import themepark.Visitor;
import themepark.attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;
    Visitor tallVisitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("roller");
        visitor = new Visitor(1, 14, 1.75, 50.50);
        tallVisitor = new Visitor(1, 14, 2.00, 50.50);
    }

    @Test
    public void hasName(){
        assertEquals("roller", rollercoaster.getName());
    }


    @Test
    public void checkSecurity(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void checkPriceForTallVisitor(){
        assertEquals(16.80, rollercoaster.priceFor(tallVisitor), 0.01);
    }

    @Test
    public void checkPriceForShortVisitor(){
        assertEquals(8.40, rollercoaster.priceFor(visitor), 0.01);
    }

}
