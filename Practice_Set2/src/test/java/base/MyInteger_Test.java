package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	int num1 = 1;
	int num2 = 2;
	int num3 = 3;
	int num4 = 4;
	int num5 = 5;
	int num11 = 11;
	int num12 = 12;
	int num20 = 20;
	MyInteger new1 = new MyInteger(num1);
	MyInteger new2 = new MyInteger(num2);
	MyInteger new3 = new MyInteger(num3);
	MyInteger new4 = new MyInteger(num4);
	MyInteger new5 = new MyInteger(num5);
	MyInteger new11 = new MyInteger(num11);
	MyInteger new12 = new MyInteger(num12);
	MyInteger new20 = new MyInteger(num20);

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

	@Test
	public void TestisEven() {
		assertTrue(MyInteger.isEven(num2));
		assertFalse(MyInteger.isEven(num1));
		assertFalse(new1.isEven(new1));
		assertTrue(new2.isEven(new2));
	}

	@Test
	public void TestisOdd() {
		assertTrue(MyInteger.isOdd(num3));
		assertFalse(MyInteger.isOdd(num4));
		assertFalse(new4.isOdd(new4));
		assertTrue(new3.isOdd(new3));
	}

	@Test
	public void TestisPrime() {
		assertTrue(MyInteger.isPrime(num5));
		assertTrue(MyInteger.isPrime(num11));
		assertFalse(MyInteger.isPrime(num12));
		assertFalse(MyInteger.isPrime(num20));
		assertTrue(new5.isPrime(new5));
		assertTrue(new11.isPrime(new11));
		assertFalse(new12.isPrime(new12));
		assertFalse(new20.isPrime(new20));
	}

	@Test
	public void Testequals() {
		assertTrue(new12.equals(num12));
		assertFalse(new12.equals(new5));
		assertFalse(new12.equals(num11));
	}
}
