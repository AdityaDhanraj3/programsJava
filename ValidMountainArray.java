package project1;

/**
 * (Question) :Given an array A of integers return true if and only if it is
 * valid mountain array.
 * 
 * Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < A[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true
 * @author adity
 *
 */
public class ValidMountainArray {
	public static boolean validMountArray(int arr[]) {
		int i = 0;
		while (i < arr.length && i + 1 < arr.length && arr[i] < arr[i + 1]) {
			i++;
		}
		if (i == 0 || i + 1 >= arr.length) {
			return false;
		}
		while (i < arr.length && i + 1 < arr.length) {
			if (arr[i] <= arr[i + 1]) {

				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 3, 2, 1 };
		System.out.println(validMountArray(arr));
		int arr1[] = { 0, 3, 2, 2, 3 };
		System.out.println(validMountArray(arr1));

	}
}


OUTPUT :
true
false
