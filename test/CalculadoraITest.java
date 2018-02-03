/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ottoalexander
 */
public class CalculadoraITest {
    
    public CalculadoraITest() {
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
     * Test of suma method, of class CalculadoraI.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 0;
        int b = 0;
        int c = 0;
        CalculadoraI instance = new CalculadoraI();
        int expResult = 0;
        int result = instance.suma(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class CalculadoraI.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 0;
        int b = 0;
        int c = 0;
        CalculadoraI instance = new CalculadoraI();
        int expResult = 0;
        int result = instance.resta(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mult method, of class CalculadoraI.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        int a = 0;
        int b = 0;
        int c = 0;
        CalculadoraI instance = new CalculadoraI();
        int expResult = 0;
        int result = instance.mult(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class CalculadoraI.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int a = 0;
        int b = 0;
        int c = 0;
        CalculadoraI instance = new CalculadoraI();
        int expResult = 0;
        int result = instance.div(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
