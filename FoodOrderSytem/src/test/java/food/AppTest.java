package food;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void assequl1()
    {
    	assertEquals(4,App.Add(2));
    }
    
    @Test
    public void assequl()
    {
    	assertEquals(-4,App.Add(-2));
    }
    
}
