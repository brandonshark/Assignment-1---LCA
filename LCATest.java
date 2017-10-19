import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {
	@Test
	public void testNode(){
		Node one = new Node(1);
		assertNotNull("testing node: ", one);
	}
}