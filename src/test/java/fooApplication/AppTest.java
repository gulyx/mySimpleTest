package fooApplication;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    // An instance of the Class Under Test
    App cut;
    
    @Before
    public void configureApp(){
        this.cut = new App();
    }
    
    @Test
    public void assessInc()
    {
        int i = 10;
        int outcome = this.cut.inc(i);
        assertEquals(i,outcome);
    }

    @Test
    public void assessChk()
    {
        assertTrue( this.cut.chk() );
    }
}
