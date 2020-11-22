package project2;
/**
 * Problem Description:
Write a program to check given singly linked list is a circular linked list or not.

Circular linked list is a sequence of elements in which every element has link to its next element in
 the sequence and the last element has a link to the first element in the sequence.

Algorithm:

Traverse from head node.
Compare the current node with its next node.
If the data of the next node is same as current nodes data, then delete the next node.
Update current nodes next pointer to next nodes next value.
 * @author adity
 *
 */
public class IsCircularLinkedList {
	public static class Node {
		int data;
		Node next;

		Node(int temp) {
			data = temp;
		}
	}

	static boolean isCircularLinkedList(Node head) {
		if (head == null) {
			return Boolean.FALSE;
		}
		Node temp = head;
		do {
			temp = temp.next;
		} while (temp != null && temp != head);
		
			return (temp == head);
	}

	public static void main(String[] args) {
		Node n1 = new Node(34);
		Node n2 = new Node(40);
		Node n3 = new Node(22);
		Node n4 = new Node(12);
		Node n5 = new Node(36);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		System.out.println("is CircularLinkedList " + isCircularLinkedList(n1));

	}

}
