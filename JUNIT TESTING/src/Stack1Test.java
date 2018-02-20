import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;

public abstract class Stack1Test {
	public Stack1<Integer> instance;
	public Stack1Test() {
		
	}
	@Before
	public abstract void setUp();

	@Test
	public void testIsEmpty() {
		System.out.println("isEmpty");
		boolean expResult = true;
		boolean result =instance.isEmpty();
		assertEquals(expResult, result);
	}

}
