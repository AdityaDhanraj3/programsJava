package project2;

/**
 * For a binary tree to be a binary search tree (BST) , the data of all the
 * nodes in the left sub-tree of the root node should be less than or equals to
 * the data of the root. The data of all the nodes in the right subtree of the
 * root node should be greater than the data of the root. Binary Search Tree
 * 
 * @author adity
 *
 */
public class BstHeight {
	private BstNode root = null;

	class BstNode {
		public Integer getData() {
			return data;
		}

		public void setData(Integer data) {
			this.data = data;
		}

		public BstNode getLeft() {
			return left;
		}

		public void setLeft(BstNode left) {
			this.left = left;
		}

		public BstNode getRight() {
			return right;
		}

		public void setRight(BstNode right) {
			this.right = right;
		}

		Integer data;
		BstNode left;
		BstNode right;

		BstNode(int temp) {
			data = temp;
		}
	}

	public void insert(int data) {
		if (root == null) {
			this.root = new BstNode(data);
			System.out.println(" -> inserted " + data);
			return;
		}
		insertNode(root, data);
		System.out.println(" -> inserted: " + data);
		System.out.println();
	}

	private BstNode insertNode(BstNode root, int data) {
		BstNode temp = null;
		System.out.print(" -> " + root.data);
		if (root.data >= data) {
			System.out.print(" [L] ");
			if (root.left == null) {
				root.left = new BstNode(data);
				return root.left;
			} else {
				temp = root.left;
			}
		} else {
			System.out.print(" [R] ");
			if (root.right == null) {
				root.right = new BstNode(data);
				return root.right;
			} else {
				temp = root.right;
			}
		}
		return insertNode(temp, data);

	}

	public Integer findHeight() {

		return getNodeHeight(this.root);
	}

	private Integer getNodeHeight(BstNode node) {

		if (node == null) {
			return -1;
		}

		return Math.max(getNodeHeight(node.getLeft()), getNodeHeight(node.getRight())) + 1;
	}

	public static void main(String[] args) {
		BstHeight bst = new BstHeight();
		bst.insert(10);
		bst.insert(20);
		bst.insert(21);
		bst.insert(8);
		bst.insert(6);
		bst.insert(16);
		bst.insert(23);
		bst.insert(2);
		System.out.println("-------------------");
		System.out.println("Height of the tree: " + bst.findHeight());
	}
}
