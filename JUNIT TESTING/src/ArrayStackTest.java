import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;

public class ArrayStackTest extends Stack1Test{
	public ArrayStackTest() {	
	}

	@Before
	@Override
	public void setUp() {
		instance = new ArrayStack<>();  
	}
	
	@Test
	public void testResize() {
		System.out.println("resize");
		instance.push(1);
		instance.push(2);
		instance.push(3);
		instance.push(4);
		String expResult = "[1,2,3,4]";
		System.out.println("expected result "+ expResult );
		String result = instance.toString();
		System.out.println("actual result "+ result);
		assertEquals(expResult,result);
	}
}
