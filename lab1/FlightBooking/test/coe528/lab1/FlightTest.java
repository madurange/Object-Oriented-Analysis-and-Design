/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing all the methods and the constructor of the flight class
 * @author pasindu
 */
public class FlightTest {
    
    public FlightTest() {
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
    /***
     * Test of valid constructor
     */
    @Test
    public void testConstructor(){
        System.out.println("Valid Constructor");
        Flight instance=null;
        boolean gotEx=false;
        try {
            instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        } catch (Exception e) {
            gotEx=true;
        }
        assertNotNull(instance);
        assertFalse(gotEx);
    }
    
    /***
     * Test of invalid constructor
     */
    @Test
    public void testInvalidConstructor(){
        System.out.println("Invalid Constructor");
        Flight instance=null;
        boolean gotEx=false;
        try {
            instance = new Flight(0, "Toronto", "Toronto", "01/01/2018 6.00pm", 100, 2000);
        } catch (Exception e) {
            gotEx=true;
        }
        assertNull(instance);
        assertTrue(gotEx);
    }
    
    
    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int expResult=999;
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        instance.setFlightNumber(999);
        int result=instance.getFlightNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String expResult="Ottawa";
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        instance.setOrigin("Ottawa");
        String result=instance.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String expResult="India";
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        instance.setDestination("India");
        String result=instance.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String expResult="09/09/2009 9.00pm";
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        instance.setDepartureTime("09/09/2009 9.00pm");
        String result=instance.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int expResult=200;
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        instance.setCapacity(200);
        int result=instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int expResult=12;
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        instance.setNumberOfSeatsLeft(12);
        int result=instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double expResult=5000.0;
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        instance.setOriginalPrice(5000.0);
        double result=instance.getOriginalPrice();
        assertEquals(expResult, result,0);
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        int expResult=0;
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        int result=instance.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        String expResult="Toronto";
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        String result=instance.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        int expResult=100;
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        int result=instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        String expResult="Sri Lanka";
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        String result=instance.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        String expResult="01/01/2018 6.00pm";
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        String result=instance.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        int expResult=100;
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        int result=instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        double expResult=2000;
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        double result=instance.getOriginalPrice();
        assertEquals(expResult, result,0);
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult="Flight 0, Toronto to Sri Lanka, 01/01/2018 6.00pm, Original Price: $2000.0";
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        String result=instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of bookASeat method, of class Flight with 0 seats left.
     */
    @Test
    public void test1BookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        instance.setNumberOfSeatsLeft(0);
        boolean expResult = false;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of bookASeat method, of class Flight with seats available.
     */
    @Test
    public void test2BookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(0, "Toronto", "Sri Lanka", "01/01/2018 6.00pm", 100, 2000);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        
    }
}
