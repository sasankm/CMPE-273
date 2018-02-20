import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTest {
	Array a = new Array();

	@Test
	public void testAddonetoarray() {
		int expected[] = new int[] {10,11};
		assertArrayEquals(expected, a.addonetoarray(new int[] {9,10}));	
	}

	@Test
	public void testMulbytwo() {
		int expected[] =new int[] {4,8};
		assertArrayEquals(expected,a.mulbytwo(new int[] {2,4}));
	}

}
