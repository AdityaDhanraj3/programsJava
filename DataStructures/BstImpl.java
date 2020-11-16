package project2;

import java.util.LinkedList;
import java.util.Queue;

public class BstImpl {
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
	public void levelOrderTraversal() {
		 
        Queue<BstNode> discovedNodeQueue = new LinkedList<>();
        if(this.root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        discovedNodeQueue.add(this.root);
        while (!discovedNodeQueue.isEmpty()) {
 
            BstNode tmpNode = discovedNodeQueue.remove();
            if(tmpNode.getLeft() != null) { discovedNodeQueue.add(tmpNode.getLeft()); }
            if(tmpNode.getRight() != null) { discovedNodeQueue.add(tmpNode.getRight()); }
            System.out.print(tmpNode.getData()+" ");
        }
    }
	 public void preOrderTraversal() {
	        doPreOrder(this.root);
	    }
	 
	    private void doPreOrder(BstNode root) {
	 
	        if(root == null) return;
	        System.out.print(root.getData()+" ");
	        doPreOrder(root.getLeft());
	        doPreOrder(root.getRight());
	    }
	    public void inOrderTraversal() {
	        doInOrder(this.root);
	    }
	 
	    private void doInOrder(BstNode root) {
	 
	        if(root == null) return;
	        doInOrder(root.getLeft());
	        System.out.print(root.getData()+" ");
	        doInOrder(root.getRight());
	    }
	    public void postOrderTraversal() {
	        doPostOrder(this.root);
	    }
	 
	    private void doPostOrder(BstNode root) {
	 
	        if(root == null) return;
	        doPostOrder(root.getLeft());
	        doPostOrder(root.getRight());
	        System.out.print(root.getData()+" ");
	    }

	public static void main(String[] args) {
		BstImpl bst = new BstImpl();
		bst.insert(39);
		bst.insert(45);
		bst.insert(23);
		bst.insert(9);
		bst.insert(366);
		bst.insert(124);
		bst.insert(90);
		bst.insert(46);
		 System.out.println("-------------------");
	        System.out.println("Level order traversal");
	        bst.levelOrderTraversal();
	        System.out.println("\n-------------------");
	        System.out.println("Pre Order Traversal");
	        bst.preOrderTraversal();
	        System.out.println("\n-------------------");
	        System.out.println("In Order Traversal");
	        bst.inOrderTraversal();
	        System.out.println("\n-------------------");
	        System.out.println("Post Order Traversal");
	        bst.postOrderTraversal();
	}

}
