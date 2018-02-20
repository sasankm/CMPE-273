import static org.junit.Assert.*;
import org.junit.*;

public class StackTest {
	public Stack stack;
	@Before
	public void init() {
		stack = new Stack(5);
	}

	@Test
	public void testPush() {
		stack.Push(10);
		stack.Push(20);
		assertTrue(!stack.isEmpty());
		assertTrue(20==stack.Peek());
		
	}

	@Test
	public void testIsFull() {
		assertFalse(stack.isFull());
	}

	@Test
	public void testPop() {
		stack.Push(99);
		stack.Pop();
		assertTrue(true == stack.isEmpty());	
		stack.Push(100);
		assertEquals(stack.Peek(),100);
	}

	@Test
	public void testIsEmpty() {
		assertTrue(stack.isEmpty());
		stack.Push(22);
		assertFalse(stack.isEmpty());	
	}

}
