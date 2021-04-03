/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import dao.TransportistaDao;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Santiago Mendez
 */
public class TransportistaDaoTest {
    
    /**
     *
     */
    public TransportistaDaoTest() {
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
     * Test of consultarClienteById method, of class TransportistaDao.
     */
    @Test
    public void testConsultarClienteById() {
        System.out.println("consultarClienteById");
        int id = 0;
        TransportistaDao instance = new TransportistaDao();
        List expResult = instance.consultarClienteById(id);
        List result = instance.consultarClienteById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarClienteByNombre method, of class TransportistaDao.
     */
    @Test
    public void testConsultarClienteByNombre() {
        System.out.println("consultarClienteByNombre");
        String nombre = "";
        TransportistaDao instance = new TransportistaDao();
        List expResult = instance.consultarClienteByNombre(nombre);
        List result = instance.consultarClienteByNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCliente method, of class TransportistaDao.
     */
    @Test
    public void testMostrarCliente() {
        System.out.println("mostrarCliente");
        TransportistaDao instance = new TransportistaDao();
        List expResult = instance.mostrarCliente();
        List result = instance.mostrarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCliente method, of class TransportistaDao.
     */
    @Ignore
    public void testAgregarCliente() {
        System.out.println("agregarCliente");
        int id = 0;
        TransportistaDao instance = new TransportistaDao();
        List expResult = instance.agregarCliente(id);
        List result = instance.agregarCliente(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actCliente method, of class TransportistaDao.
     */
    @Ignore
    public void testActCliente() {
        System.out.println("actCliente");
        TransportistaDao instance = new TransportistaDao();
        List expResult = instance.actCliente();
        List result = instance.actCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCliente method, of class TransportistaDao.
     */
    @Ignore
    public void testBorrarCliente() {
        System.out.println("borrarCliente");
        TransportistaDao instance = new TransportistaDao();
        List expResult = instance.borrarCliente();
        List result = instance.borrarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarClientebyId method, of class TransportistaDao.
     */
    @Test
    public void testCargarClientebyId() {
        System.out.println("cargarClientebyId");
        int id = 0;
        TransportistaDao instance = new TransportistaDao();
        List expResult = instance.cargarClientebyId(id);
        List result = instance.cargarClientebyId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
