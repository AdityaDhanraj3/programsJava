package project2;

public class BstMinMaxValues {
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

	public Integer findMinValue() {

		return minValue(this.root);
	}

	public Integer findMaxValue() {

		return maxValue(this.root);
	}

	private Integer minValue(BstNode node) {

		if (node.getLeft() != null) {
			return minValue(node.getLeft());
		}
		return node.getData();
	}

	private Integer maxValue(BstNode node) {

		if (node.getRight() != null) {
			return maxValue(node.getRight());
		}
		return node.getData();
	}

	public static void main(String[] args) {
		BstMinMaxValues bst = new BstMinMaxValues();
		bst.insert(10);
		bst.insert(20);
		bst.insert(21);
		bst.insert(8);
		bst.insert(6);
		bst.insert(16);
		bst.insert(23);
		bst.insert(2);
		System.out.println("-------------------");
		System.out.println("Min value: " + bst.findMinValue());
		System.out.println("Max value: " + bst.findMaxValue());
	}

}
