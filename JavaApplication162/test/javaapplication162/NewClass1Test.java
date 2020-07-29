/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication162;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mihov
 */
public class NewClass1Test {
    
    public NewClass1Test() {
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
     * Test of nestoDrugo method, of class NewClass1.
     */
    @Test
    public void testNestoDrugo() {
        System.out.println("nestoDrugo");
        NewClass1 instance = new NewClass1();
        int expResult = 20;
        int result = instance.nestoDrugo();
        assertEquals(expResult, result);
    }
    
}
