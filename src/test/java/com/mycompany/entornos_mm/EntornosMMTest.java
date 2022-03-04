/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.entornos_mm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno_Tarde
 */
public class EntornosMMTest {
    
    public EntornosMMTest() {
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
     * Test of main method, of class EntornosMM.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EntornosMM.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unMetodoSospechoso method, of class EntornosMM.
     */
    @Test
    public void testUnMetodoSospechoso() {
        System.out.println("Positivos");
        int[] Matriz = {10,8,28,33,1};
        EntornosMM.ordenar(Matriz);
        
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
