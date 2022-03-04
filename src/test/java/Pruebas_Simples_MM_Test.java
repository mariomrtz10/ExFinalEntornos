/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.entornos_mm.EntornosMM;
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
public class Pruebas_Simples_MM_Test {

    public Pruebas_Simples_MM_Test() {
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

    @Test
    public void testOrdenar() {
        System.out.println("Positivos");
        int[] Matriz = {10, 8, 28, 33, 1};
        int[] espRes = {1, 8, 10, 28, 33};// resultado esperado
        EntornosMM.ordenar(Matriz);
        assertArrayEquals(Matriz, espRes);//Comparamos el resultado de la matriz con el resulktado esperado si pasa el test el metodo funciona correctamente

    }

    @Test
    public void testOrdenarNeg() {// Lo mismo en los 2 siguientes tests
        System.out.println("Negativos");
        int[] Matriz = {-5,-55,-37,-12,-16};
        int [] espRes = {-55,-37,-16,-12,-5};
        EntornosMM.ordenar(Matriz);
        assertArrayEquals(Matriz,espRes);
    }
    @Test
    public void testOrdenarNegYPos() {
        System.out.println("Negativos y Positivos");
        int[] Matriz = {-5,18,22,-12,0};
        int [] espRes = {-12,-5,0,18,22};
        EntornosMM.ordenar(Matriz);
        assertArrayEquals(Matriz,espRes);
    }
}
