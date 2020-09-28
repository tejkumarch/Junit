package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {
	//Calculator c=new Calculator();
	Calculator c=null;
	@Before
	public void meth1()
	{
		c=new Calculator();
	}
	
	@After
	public void meth2()
	{
		c=null;
	}
	
	@BeforeClass
	public static void meth3()
	{
		System.out.println("before starting");
	}
	
	@AfterClass
	public static void meth4()
	{
		System.out.println("after completing");
	}

	@Test
	public void testAdd() {
		assertEquals(6, c.add(4, 2));
		assertNotEquals(7, c.add(4, 2));
	}

	@Test
	public void testSub() {
		assertEquals(2, c.sub(4, 2));
		assertNotEquals(7, c.sub(4, 2));
	}

	

}