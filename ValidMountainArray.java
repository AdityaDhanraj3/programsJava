package project1;

/**
 * (Question) :Given an array A of integers return true if and only if it is
 * valid mountain array.
 * 
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