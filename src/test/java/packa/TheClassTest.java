package packa;

import junit.framework.TestCase;
import packa.TheClass;

public class TheClassTest extends TestCase {
	
	 String message = "Hello World2";
	 TheClass pp = new TheClass();
	 String messageReturn = pp.vai(message);

	public TheClassTest(String name) {
		super(name);
	}

	public void testMain() {
		assertTrue( true );
	}

	public void testVai() {
		assertEquals(message, messageReturn);
		// comment aaa
	}
	
	public void testVai2() {
		System.out.println("now we are talking");
	}

}
