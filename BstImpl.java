package project2;
/**
 * Description:
For a binary tree to be a binary search tree (BST), the data of all the nodes in the left sub-tree of the root node should be less than or equals to the data of the root.
 The data of all the nodes in the right subtree of the root node should be greater than the data of the root. 
This example shows the implementation of a binary search tree level order traversal (breadth first).

What is Level order traversal (breadth first)?
In Level order traversal, we visit every node on a level before going to a lower level from left to right.
 This is also known as Breadth first traversal as the search tree is broadened as much as possible on each depth before going to the next depth.
  Below picture shows the level order traversal.

Here is the steps to implement Level order traversal:

Since we have to traverse in same level until we cover all nodes in the same level, 
it is hard to keep the node references, we will maintain a queue for storing all discovered nodes.
Initially the queue will be empty.
If the root node is not null, push it to the queue.
Use a while loop to visit all nodes in the queue until the queue is empty.
Inside while loop, pop out the node.
Add the left node to the queue if it is not null.
Add the right node to the queue if it is not null.
Read the node data and display it.
Repeat from step 5, until the queue is empty.

What is pre-order traversal (depth first)?
Tree traversal means we visiting all nodes in the tree, visiting means either of accessing node data or processing node data.
 Traversal can be specified by the order of visiting 3 nodes, ie current node, left subtree and right subtree.
  In pre-order traversal, first we visit the current node, then left subtree and then right subtree. 
  
Here is the steps to implement pre-order traversal:

Start with root node.
Check if the current node is empty / null.
Display the data part of the root (or current node).
Traverse the left subtree by recursively calling the pre-order function.
Traverse the right subtree by recursively calling the pre-order function.

What is in-order traversal (depth first)?
Tree traversal means we visiting all nodes in the tree, visiting means either of accessing node data or processing node data.
 Traversal can be specified by the order of visiting 3 nodes, ie current node, left subtree and right subtree.
  In in-order traversal, first we visit the left subtree, then current node and then right subtree. In-order traversal gives data in the sorted order. 

Here is the steps to implement in-order traversal:

Start with root node.
Check if the current node is empty / null.
Traverse the left subtree by recursively calling the in-order function.
Display the data part of the root (or current node).
Traverse the right subtree by recursively calling the in-order function.

What is post-order traversal (depth first)?
Tree traversal means we visiting all nodes in the tree, visiting means either of accessing node data or processing node data.
 Traversal can be specified by the order of visiting 3 nodes, ie current node, left subtree and right subtree.
  In post-order traversal, first we visit the left subtree, then the right subtree, and then current node.

Here is the steps to implement post-order traversal:

Start with root node.
Check if the current node is empty / null.
Traverse the left subtree by recursively calling the post-order function.
Traverse the right subtree by recursively calling the post-order function.
Display the data part of the root (or current node).
 */
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
