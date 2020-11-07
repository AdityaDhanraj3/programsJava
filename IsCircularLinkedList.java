package project2;

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
		{
			return (temp == head);
		}

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
