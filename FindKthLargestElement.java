package project1;

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
