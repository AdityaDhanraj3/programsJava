package project1;
/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.
Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
 */
import java.util.PriorityQueue;

public class MergeKsortedList {
	public static class ListNode {

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		ListNode next;
		int data;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public static void mergeKList(ListNode[] lists) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (ListNode head : lists) {
			while (head != null) {
				minHeap.add(head.data);
				head = head.next;

			}
		}
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		while (!minHeap.isEmpty()) {
			head.next = new ListNode(minHeap.remove());
			head = head.next;
		}
		while (dummy != null) {
			if (dummy.data != 1)
				System.out.println(dummy.data + " ");
			dummy = dummy.next;
		}
	}

	public static void main(String[] args) {
		int k = 3; // number of arrays
		// int n=3; //size of array
		ListNode lists[] = new ListNode[k];
		lists[0] = new ListNode(1);
		lists[0].next = new ListNode(4);
		lists[0].next.next = new ListNode(5);

		lists[1] = new ListNode(1);
		lists[1].next = new ListNode(3);
		lists[1].next.next = new ListNode(4);

		lists[2] = new ListNode(2);
		lists[2].next = new ListNode(6);
		mergeKList(lists);

	}

}
