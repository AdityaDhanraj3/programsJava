package project1;
/**
 * Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e] such that sorting this
 * subarray makes the whole array sorted.

Examples:
1) If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your program should be able to find that the subarray 
   lies between the indexes 3 and 8.

2) If the input array is [0, 1, 15, 25, 6, 7, 30, 40, 50], your program should be able to find that the subarray
  lies between the indexes 2 and 5.
 * @author adity
 *
 */
public class FindTheSmallestWindowToBeSorted {
	public static void findSmallestWindow(int arr[]) {
		int leftIndex = -1;
		int rightIndex = -1;
		// traverse from left to right and keep track of maximum so far.
		int maxSoFar = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (maxSoFar < arr[i]) {
				maxSoFar = arr[i];
			}
			// find the last position which is less than the maxSoFar.
			if (arr[i] < maxSoFar) {
				rightIndex = i;
			}
		}
		// traverse from right to left and keep track of minimum so far. 
		int minSoFar = Integer.MAX_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (minSoFar > arr[i]) {
				minSoFar = arr[i];

			}
			if (arr[i] > minSoFar) {
				leftIndex = i;
			}
		}
		System.out.println("sort array from index :" + leftIndex + " to index : " + rightIndex);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 7, 5, 6, 4, 8 };
		findSmallestWindow(arr);
	}

}

OUTPUT:
sort array from index :3 to index : 6
