class Node {
	    int data;
	    Node left;
	    Node right;
	 
	    Node(int value) {
	        data = value;
	        left = null;
	        right = null;
	    }
	}
public class LCA {
		
		Node root;

		Node findLCA(int q, int w) {

			return findLCA(root, q, w);
		}

		Node findLCA(Node node, int q, int w) {

			if (node == null) {
				return null;
			}

			if (node.data == q || node.data == w) {
				return node;
			}

			Node left = findLCA(node.left, q, w);
			Node right = findLCA(node.right, q, w);

			if (left != null && right != null) {
				return node;
			}

			if (left != null) {
				return left;
			} else {
				return right;
			}

		}

		
	}
	

