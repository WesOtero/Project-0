package com.revature.CarDealershipApp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//    
//    
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
	//Testing JUnit Method
	@Test
	public void testTest() {
	}
	
	/*******************************************************************
	 * Story 1: As a user, I can login.
	 ******************************************************************/
	//Good passwd
	@Test
	public void employeeLogsIn() {
		assertTrue(false);
	}
	
	@Test
	public void customerLogsIn() {
		assertTrue(false);
	}
	//Bad passwd
	@Test
	public void employeeFailsLogIn() {
		assertFalse(false);
	}
	
	@Test
	public void customerFailsLogIn() {
		assertFalse(false);
	}
	/*******************************************************************
	 * Story 2: As an employee, I can add a car to the lot.
	 ******************************************************************/
	//Add car to the lot
	@Test
	public void employeeAddsCar() {
		assertTrue(false);
	}
	
	//Invalid data
	public void employeeAddsInvalidCar() {
		assertTrue(false);
	}
	
	/*******************************************************************
	 * Story 3: As a customer, I can view the cars on the lot.
	 ******************************************************************/
	//Add car to the lot
	@Test
	public void customerCarView() {
		assertTrue(false);
	}
	
	/*******************************************************************
	 * Story 4: As a customer, I can make an offer for a car.
	 ******************************************************************/
	
	//Invalid data
	public void customerMakesAnOffer() {
		assertTrue(false);
	}
	
	/*******************************************************************
	 * Story 5: As an employee, I can accept or reject an offer for a car.
	 ******************************************************************/
	
	//Invalid data
	public void employeeAcceptOffer() {
		assertTrue(false)
	}
	
	public void employeeRejectOffer() {
		assertTrue(false)
	}
	
	/*******************************************************************
	 * Story 6: As the system, I reject all other pending offers for a car when an offer is accepted.*
	 ******************************************************************/
	
	//Invalid data
	public void employeeRejectOffer() {
		assertTrue(false)
	}

	
	
}
