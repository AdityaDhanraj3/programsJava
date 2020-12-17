package project2;
/**
 * Bubble sort, also referred to as sinking sort, is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted, 
 * comparing each pair of adjacent items and swapping them if they are in the wrong order. The pass through the list is repeated until no swaps are needed,
 *  which indicates that the list is sorted. The algorithm gets its name from the way smaller elements "bubble" to the top of the list.
 *   Because it only uses comparisons to operate on elements, it is a comparison sort. Although the algorithm is simple, most of the other sorting algorithms are more efficient for large lists.

Bubble Sort

Bubble sort has worst-case and average complexity both О(n2), where n is the number of items being sorted. There exist many sorting algorithms with
 substantially better worst-case or average complexity of O(n log n). Even other О(n2) sorting algorithms, such as insertion sort, tend to have better performance than bubble sort.
  Therefore, bubble sort is not a practical sorting algorithm when n is large.
Performance of bubble sort over an already-sorted list (best-case) is O(n).
 * @author adity
 *
 */
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int temp;
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" " + arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 20, 18, 25, 30, 15 };
		bubbleSort(arr);
	}

}

OUTPUT: 
 15
 18
 20
 25
 30

