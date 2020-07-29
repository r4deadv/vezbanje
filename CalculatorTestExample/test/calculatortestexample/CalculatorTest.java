package calculatortestexample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass static method");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before method example");
    }
    
    @After
    public void tearDown() {
        System.out.println("Just After method");
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 3;
        int b = 2;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of mul method, of class Calculator.
     */
    @Test
    public void testMul() throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("mul");
        Integer a = 2;
        Integer b = 3;
        int expResult = 6;
        Calculator instance = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("mul", new Class[]{int.class,int.class});
        method.setAccessible(true);
        int result = (int)method.invoke(instance, 2,3);
        assertEquals(expResult, result);
        
    }
    
}
