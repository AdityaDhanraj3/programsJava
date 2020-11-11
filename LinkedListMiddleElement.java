package project1;
/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
If there are two middle nodes, return the second middle node.
Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * @author adity
 *
 */
public class LinkedListMiddleElement {

	static class Node {
		int data;
		Node next;

		Node(int tmp) {
			data = tmp;
		}
	}

	static void findMiddleElementV1(Node head) {
		/**
		 * In this method, first we get the element count by traversing through the
		 * linked list. Then we identify middle element index by count. Then traverse
		 * through linked list nodes based on count.
		 */

		int count = 0;
		Node countNode = head;
		while (countNode != null) {
			countNode = countNode.next;
			count++;
		}
		count = count / 2;
		while (head != null) {
			head = head.next;
			count--;
			if (count == 0) {
				System.out.println("Middle Element: " + head.data);
				return;
			}
		}
	}

	static void findMiddleElementV2(Node head) {

		/**
		 * In this approach, we will have two node references. First node, we increment
		 * by two steps Second node, we increment ny one step. At the end we get the
		 * middle element ny second node.
		 */
		Node singIncNode = head;
		Node doubIncNode = head;
		if (head == null) {
			System.out.println("The haed node is null, no elements in the linked list");
		}

		while (doubIncNode != null && doubIncNode.next != null) {
			doubIncNode = doubIncNode.next.next;
			singIncNode = singIncNode.next;
		}
		System.out.println("Middle Element: " + singIncNode.data);
	}

	public static void main(String a[]) {

		Node n1 = new Node(10);
		Node n2 = new Node(29);
		Node n3 = new Node(20);
		Node n4 = new Node(25);
		Node n5 = new Node(10);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		findMiddleElementV2(n1);
	}

}

	