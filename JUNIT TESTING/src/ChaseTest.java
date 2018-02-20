import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.*;

public abstract class ChaseTest {
	public abstract MyInterface createInstance();
    Chase i = new Chase();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRateOfInterest() {
		equals(2.75==i.RateOfInterest());
	}

}
