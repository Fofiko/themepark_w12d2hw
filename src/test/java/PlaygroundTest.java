import themepark.Visitor;
import themepark.attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("swings");
        visitor = new Visitor(1, 14, 1.75, 50.50);
    }

    @Test
    public void hasName(){
        assertEquals("swings", playground.getName());
    }

    @Test
    public void checkSecurity(){
        assertEquals(true, playground.isAllowedTo(visitor));
    }
}
