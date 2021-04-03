/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import models.Transportista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Santiago Mendez
 */
public class homeControllerTest {
    
    /**
     *
     */
    public homeControllerTest() {
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
     * Test of home method, of class homeController.
     */
    @Test
    public void testHome() {
        System.out.println("home");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.home();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCliente method, of class homeController.
     */
    @Test
    public void testMostrarCliente() {
        System.out.println("mostrarCliente");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.mostrarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarClientesxNombre method, of class homeController.
     */
    @Test
    public void testListarClientesxNombre_0args() {
        System.out.println("listarClientesxNombre");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.listarClientesxNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarClientesxNombre method, of class homeController.
     */
    @Test
    public void testListarClientesxNombre_3args() {
        System.out.println("listarClientesxNombre");
        Transportista cli = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.listarClientesxNombre(cli, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarCliente method, of class homeController.
     */
    @Test
    public void testCargarCliente() {
        System.out.println("cargarCliente");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.cargarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCliente method, of class homeController.
     */
    @Test
    public void testAgregarCliente() {
        System.out.println("agregarCliente");
        Transportista cli = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.agregarCliente(cli, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actCliente method, of class homeController.
     */
    @Test
    public void testActCliente_HttpServletRequest() {
        System.out.println("actCliente");
        HttpServletRequest request = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.actCliente(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actCliente method, of class homeController.
     */
    @Test
    public void testActCliente_3args() {
        System.out.println("actCliente");
        Transportista cli = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.actCliente(cli, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCliente method, of class homeController.
     */
    @Test
    public void testBorrarCliente() {
        System.out.println("borrarCliente");
        HttpServletRequest request = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.borrarCliente(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarClientebyId method, of class homeController.
     */
    @Test
    public void testCargarClientebyId() {
        System.out.println("cargarClientebyId");
        int id = 0;
        homeController instance = new homeController();
        Transportista expResult = null;
        Transportista result = instance.cargarClientebyId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarClientesxId method, of class homeController.
     */
    @Test
    public void testListarClientesxId() {
        System.out.println("listarClientesxId");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.listarClientesxId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
