package project1;

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
