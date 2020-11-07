package project2;

public class MyLinearSearch {
	public static int linearSearch(int[] arr, int key) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int SearchKey = 14;
		System.out.println("key " + SearchKey + " found at index " + linearSearch(arr1, SearchKey));

		int[] arr2 = { 3, 6, 9, 12, 15, 18, 21, 24 };
		int SearchKey1 = 18;

		System.out.println("key " + SearchKey1 + " found at index " + linearSearch(arr2, SearchKey1));

	}

}
