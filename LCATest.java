import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {
	@Test
	public void testNode(){
		Node one = new Node(1);
		assertNotNull("testing node: ", one);
	}
	@Test
	public void testEmptyBST() {
		LCA bst = new LCA();
		assertEquals("Find LCA when bst is empty: ", null, bst.findLCA(1, 2) );
		assertNull("Find LCA when bst is empty: ", bst.findLCA(1, 2));
	}
	@Test
	public void testCommonAncestor(){

		LCA bst = new LCA();
		bst.root = new Node(1);
		bst.root.left = new Node(2);
		bst.root.right = new Node(3);
		bst.root.left.left = new Node(4);
		bst.root.left.right = new Node(5);
		bst.root.right.left = new Node(6);
		bst.root.right.right = new Node(7);

		assertEquals("LCA of 4 and 5: ", 2, bst.findLCA(4, 5).data);
		assertEquals("LCA of 6 and 7: ", 3, bst.findLCA(6, 7).data);
		assertEquals("LCA of 2 and 3: ", 1, bst.findLCA(2, 3).data);
		assertEquals("LCA of 4 and 7: ", 1, bst.findLCA(4, 7).data);

	}
}