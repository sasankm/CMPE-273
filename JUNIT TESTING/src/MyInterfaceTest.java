import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyInterfaceTest {
	public MyInterface instance;
	public MyInterfaceTest() {
	
	}

	@Before
	public void setUp() {
	}
	@Test
	public void testRateOfInterest() {
		equals(2.75==instance.RateOfInterest());
	}
}
