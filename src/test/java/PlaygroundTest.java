import attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("swings");
    }

    @Test
    public void hasName(){
        assertEquals("swings", playground.getName());
    }
}
