package project2;
/**
 * Linear search or sequential search is a method for finding a particular value in a list, that consists of checking every one of its elements, 
 * one at a time and in sequence, until the desired one is found.

Linear search is the simplest search algorithm. For a list with n items, the best case is when the value is equal to the first element of the list,
 in which case only one comparison is needed. The worst case is when the value is not in the list (or occurs only once at the end of the list), in which case n comparisons are needed.

The worst case performance scenario for a linear search is that it has to loop through the entire collection, either because the item is the last one,
 or because the item is not found. In other words, if you have N items in your collection, the worst case scenario to find an item is N iterations. In Big O Notation it is O(N). The speed of search grows linearly with the number of items within your collection.

Linear searches don't require the collection to be sorted.
 * @author adity
 *
 */
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

OUTPUT :
key 14 found at index 6
key 18 found at index 5

