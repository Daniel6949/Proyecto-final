/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Santiago Mendez
 */
public class TransportistaTest {
    
    /**
     *
     */
    public TransportistaTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Transportista.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Transportista instance = new Transportista();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Transportista.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int Id = 0;
        Transportista instance = new Transportista();
        instance.setId(Id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlaca method, of class Transportista.
     */
    @Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        Transportista instance = new Transportista();
        String expResult = instance.getPlaca();
        String result = instance.getPlaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlaca method, of class Transportista.
     */
    @Test
    public void testSetPlaca() {
        System.out.println("setPlaca");
        String Placa = "";
        Transportista instance = new Transportista();
        instance.setPlaca(Placa);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Transportista.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Transportista instance = new Transportista();
        String expResult = instance.getNombre();
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Transportista.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Transportista instance = new Transportista();
        instance.setNombre(Nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Transportista.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Transportista instance = new Transportista();
        String expResult = instance.getApellido();
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Transportista.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String Apellido = "";
        Transportista instance = new Transportista();
        instance.setApellido(Apellido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Transportista.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Transportista instance = new Transportista();
        String expResult = instance.getTelefono();
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Transportista.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String Telefono = "";
        Transportista instance = new Transportista();
        instance.setTelefono(Telefono);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
