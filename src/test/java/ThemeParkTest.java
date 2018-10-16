import themepark.ThemePark;
import themepark.Visitor;
import themepark.attractions.Rollercoaster;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Rollercoaster rollercoaster;
    Visitor visitor1;

    @Before
    public void before(){
        themePark = new ThemePark("Allou");
        rollercoaster = new Rollercoaster("roller");
        visitor1 = new Visitor(33, 18, 1.75, 50.50);
    }

    @Test
    public void hasName(){
        assertEquals("Allou", themePark.getName());
    }

    @Test
    public void canAddAttraction(){
        themePark.addAttraction(rollercoaster);
        assertEquals(1, themePark.countAttractions());
    }


    @Test
    public void canReceiveVisitors(){
//        themePark.addAttraction(rollercoaster);
        assertEquals("33 has visited roller", themePark.visit(visitor1, rollercoaster));
    }

}
