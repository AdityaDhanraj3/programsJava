package project2;
/**
 * The selection sort is a combination of searching and sorting. During each pass, the unsorted element with the smallest (or largest) value is moved to 
 * its proper position in the array. The number of times the sort passes through the array is one less than the number of items in the array.
 *  In the selection sort, the inner loop finds the next smallest (or largest) value and the outer loop places that value into its proper location.

Selection sort is not difficult to analyze compared to other sorting algorithms since none of the loops depend on the data in the array.
 Selecting the lowest element requires scanning all n elements (this takesn − 1 comparisons) and then swapping it into the first position. 
 Finding the next lowest element requires scanning the remaining n − 1 elements and so on, 
 for (n − 1) + (n − 2) + ... + 2 + 1 = n(n − 1) / 2 ∈ Θ(n2) comparisons. Each of these scans requires one swap for n − 1 elements.


 * @author adity
 *
 */
public class SelectionSort {
	public static void selectionSort(int arr[]) {
		int min;
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			min = i;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
	}
	
public static void main(String[] args) {
	int arr[] = {38,52,9,18,6,62,13};
	selectionSort(arr);
}
}
