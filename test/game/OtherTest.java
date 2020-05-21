/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruiyot
 */
public class OtherTest {
    
    public OtherTest() {
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
     * Test of opportunity method, of class Other.
     */
    @Test
    public void testOpportunity() {
        System.out.println("opportunity");
        int value = 0;
        int player = 0;
        String expResult = "";
        String result = Other.opportunity(value, player);
        assertEquals(expResult, result);
    }

    /**
     * Test of potLuck method, of class Other.
     */
    @Test
    public void testPotLuck() {
        System.out.println("potLuck");
        int value = 0;
        int player = 0;
        String expResult = "";
        String result = Other.potLuck(value, player);
        assertEquals(expResult, result);
    }
    
}
