import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("crash");
    }

    @Test
    public void hasName(){
        assertEquals("crash", dodgems.getName());
    }
}
