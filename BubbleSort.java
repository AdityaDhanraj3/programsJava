package project2;

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
