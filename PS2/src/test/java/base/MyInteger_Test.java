package base;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	// Testing a true and false case for the isEven method
	@Test
	public void testEven() {
        assertTrue(MyInteger.isEven(4));
        assertFalse(MyInteger.isEven(5));
	}

	// Testing a true and false case for the isOdd method
	@Test
	public void testOdd() {
		assertTrue(MyInteger.isOdd(5));
		assertFalse(MyInteger.isOdd(4));
	}

	// Testing a true and false case for the isPrime method
	@Test
	public void testPrime() {
		assertTrue(MyInteger.isPrime(5));
		assertFalse(MyInteger.isPrime(6));
	}
}