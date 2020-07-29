package javaapplication162;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KarticaTest {
    
    public KarticaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of platiPorez method, of class Kartica.
     */
    @Test
    public void testPlatiPorez() {
        System.out.println("platiPorez");
        int amount = 40;
        Kartica instance = new Kartica();
        int expResult = 20;
        int result = instance.platiPorez(amount);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
