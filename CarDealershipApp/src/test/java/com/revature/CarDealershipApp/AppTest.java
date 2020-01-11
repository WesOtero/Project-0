package com.revature.CarDealershipApp;

import org.junit.Test;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

	/*******************************************************************
	 * Story 1: As a user, I can login.
	 ******************************************************************/
	// Good passwd
	@Test
	public void employeeLogsIn() {
		assertTrue(true);
	}

	@Test
	public void customerLogsIn() {
		assertTrue(false);
	}

	// Bad passwd
	@Test
	public void employeeFailsLogIn() {
		assertFalse(false);
	}

	@Test
	public void customerFailsLogIn() {
		assertFalse(true);
	}

	/*******************************************************************
	 * Story 2: As an employee, I can add a car to the lot.
	 ******************************************************************/
	// Add car to the lot
	@Test
	public void employeeAddsCar() {
		assertTrue(false);
	}

	// Invalid data
	public void employeeAddsInvalidCar() {
		assertTrue(false);
	}

	/*******************************************************************
	 * Story 3: As a customer, I can view the cars on the lot.
	 ******************************************************************/
	// Add car to the lot
	@Test
	public void customerCarView() {
		assertTrue(false);
	}

	/*******************************************************************
	 * Story 4: As a customer, I can make an offer for a car.
	 ******************************************************************/

	public void customerMakesAnOffer() {
		assertTrue(false);
	}

	/*******************************************************************
	 * Story 5: As an employee, I can accept or reject an offer for a car.
	 ******************************************************************/

	public void employeeAcceptOffer() {
		assertTrue(false);
	}

	public void employeeRejectOffer() {
		assertTrue(false);
	}

	/*******************************************************************
	 * Story 6: As the system, I reject all other pending offers for a car when an
	 * offer is accepted.*
	 ******************************************************************/

	// Rejects pending offers from other users
	public void systemRejectAllPending() {
		assertTrue(false);
	}

	/*******************************************************************
	 * Story 7: As an employee, I can remove a car from the lot.
	 ******************************************************************/

	// Remove car from the lot
	public void employeeCarDrop() {
		assertTrue(false);
	}

	// Remove car from the lot that doesn't exist
	public void employeeInvlidCarDrop() {
		assertTrue(false);
	}

	/*******************************************************************
	 * Story 8: As a customer, I can view the cars that I own.
	 ******************************************************************/

	// Remove car from the lot
	public void customerOwnerView() {
		assertTrue(false);
	}

	/*******************************************************************
	 * Story 9: As a customer, I can view my remaining payments for a car.
	 ******************************************************************/

	// Future payments
	public void customerDebtView() {
		assertTrue(false);
	}

	/*******************************************************************
	 * Story 10: As an employee, I can view all payments.
	 ******************************************************************/

	// Payment History
	public void customerPaymentHistoryView() {
		assertTrue(false);
	}

	/*******************************************************************
	 * Story 11: As the system, I can calculate the monthly payment.
	 ******************************************************************/

	// Payment History
	public void customerMonthlyPaymentView() {
		assertTrue(false);
	}

}
