

import com.mycompany.entornos_mm.EntornosMM;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Pruebas_Avanzadas_MM_Test {
    
    public Pruebas_Avanzadas_MM_Test() {
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
    
    @Test(timeout = 1)
    public void operacionOptima() {
        System.out.println("timeout");
        int []Matriz= new int [5000] ;
        for (int i = 0; i < Matriz.length; i++) {
            Matriz[i]= i++;           
        }
        EntornosMM.ordenar(Matriz);
        
       }
    

}
