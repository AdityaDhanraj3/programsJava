package project1;
/**
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5
Example 2:

Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4
Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
import java.util.PriorityQueue;

public class FindKthLargestElement {
	public static int findKthLargestElement(int arr[],int k) {
		PriorityQueue <Integer> pqueue = new PriorityQueue<>();
		for(int elements : arr) {
			pqueue.add(elements);
			if(pqueue.size()>k) {
				pqueue.remove();
			}
			
			
		}
		return pqueue.remove();
	}

	public static void main(String[] args) {
       int arr[] = {6,20,8,14,9,12,4,7};
       System.out.println(findKthLargestElement(arr,2));
	}
	

}
