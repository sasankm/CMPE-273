import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;

public class QueueTest  {

	public Queue q;
	@Before
	public void init() {
		q = new Queue(5);
	}

	@Test
	public void testInsert() {
		q.insert(12);
		q.insert(34);
		assertTrue(12==q.peek());
	}

	@Test
	public void testRemove() {
		q.insert(10);
		q.insert(11);
		q.remove();
		assertTrue(11==q.peek());
		assertEquals(q.remove(), 11);
	}

	@Test
	public void testIsEmpty() {
		q.insert(10);
		q.insert(21);
		q.remove();
		assertFalse(q.isEmpty());
		q.remove();
		assertTrue(q.isEmpty());
		
	}

	@Test
	public void testIsFull() {
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		assertTrue(!q.isFull());
	}

}
