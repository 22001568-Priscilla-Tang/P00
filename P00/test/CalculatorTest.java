import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 22001568, May 29, 2023 9:56:02 AM
 */

public class CalculatorTest {
    
	
	@Test
	public void testAdd() {
		// fail (Not yet implemented)
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals (expected, actual);
	}
	@Test
	public void testSubtract() {
		int a = 98;
		int b = 20;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 78;
		assertEquals (expected, actual);
        
		//assertNotEquals
		int c = 90;
		int d = 30;
		
		Calculator calc = new Calculator();
		int act = calc.subtract(c,d);
		int exp = 80;
		assertNotEquals (exp, act);
	}
	@Test
	public void testMultiple() {
		int a = 56;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 112;
		assertEquals (expected, actual);
		
		//assertNotEquals
		int c = 9;
		int d = 3;
		
		Calculator calc = new Calculator();
		int act = calc.multiply(c, d);
		int exp = 18;
		assertNotEquals(exp, act);
	}
	@Test
	public void testDivide() {
		int a = 9000;
		int b = 1000;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 9;
		assertEquals(expected, actual);
		
		    //assertNotEquals
			int c = 9;
			int d = 3;
				
			Calculator calc = new Calculator();
			int act = calc.divide(c, d);
			int exp = 4;
			assertNotEquals(exp, act);
	}
}
