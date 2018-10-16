import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("roller");
    }

    @Test
    public void hasName(){
        assertEquals("roller", rollercoaster.getName());
    }

}
