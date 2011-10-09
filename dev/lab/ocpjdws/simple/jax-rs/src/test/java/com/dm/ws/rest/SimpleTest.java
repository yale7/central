/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package com.dm.ws.rest;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class SimpleTest {
    
    public SimpleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getText method, of class Simple.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Simple instance = new Simple();
        String expResult = "";
        String result = instance.getText();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
}
