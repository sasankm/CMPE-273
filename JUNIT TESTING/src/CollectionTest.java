import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class CollectionTest {
	Collection test = new Collection();

	@Test
	public void testMyTeam() {
		
		List<String> value = test.myTeam();
	    assertEquals(Arrays.asList("sasank", "venkatesh","mathew", "thol"), test.myTeam());
	    assertEquals("sasank",value.get(0));
	    assertNotNull("the list is not null", value);
	}
	@Test
	public void testMyteam2() {
		Map<String, String> result = test.myTeam2();
		assertEquals("sasank",result.get("s"));
		result.put("p", "pushpak");
		assertEquals("pushpak", result.get("p"));
		assertFalse(result.isEmpty());
		
	}

}
