import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 22001568, May 29, 2023 9:11:37 AM
 */

public class HelloWorldTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
        System.out.println("This is the testcase for HelloWorld");
        String str1="This is the testcase for HelloWorld";
        String str2="This is the testcase for HelloWorld";
        assertEquals(str1, str2);
	}

}
