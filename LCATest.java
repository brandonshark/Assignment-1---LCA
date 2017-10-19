import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {
	@Test
	public void testNode(){
		Node one = new Node(1);
		assertNotNull("testing node: ", one);
	}
	@Test
	public void testEmptyTree() {
		
		LCA bst = new LCA();
		assertEquals("Find LCA when bst is empty: ", null, bst.findLCA(1, 2) );
		assertNull("Find LCA when bst is empty: ", bst.findLCA(1, 2));
	}

}