/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marilia
 */
public class MenuTest {
    
    public MenuTest() {
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
     * Test of getHora method, of class Menu.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saudacao method, of class Menu.
     */
    @Test
    public void testSaudacao() {
        System.out.println("saudacao");
        Menu instance = new Menu();
        instance.saudacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Menu.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        Menu instance = new Menu();
        instance.setSaldo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Menu.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Menu.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
