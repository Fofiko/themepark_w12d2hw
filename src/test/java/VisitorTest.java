import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 1.75, 50.50);
    }

    @Test
    public void hasAge(){
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(1.75, visitor.getHeight(), 0.01);
    }

    @Test
    public void hasMoney(){
        assertEquals(50.50, visitor.getMoney(), 0.10);
    }
}
