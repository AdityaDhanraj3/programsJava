package project1;

import java.util.HashMap;
import java.util.Map;

public class SumOfArray {
	public static void sumOfArray(int arr[], int sum) {
		System.out.println(sum);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(sum - arr[i])) {
				System.out.println("pair found at " + map.get(sum - arr[i]) + " & " + i);

			}
			map.put(arr[i], i);
			System.out.println(map);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 7, 9, -2, 0, 1, 9, 4, 5 };
		int sum = 50;
		sumOfArray(arr, sum);
	}

}
