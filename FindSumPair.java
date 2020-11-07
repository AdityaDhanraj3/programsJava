package project1;

import java.util.HashMap;
import java.util.Map;

public class FindSumPair {
	//0(n (log n))
	public static void findPair(int arr[],int sum) {
		int min = 0;
		int high = arr.length-1;
		while(min<high) {
			if(arr[min]+arr[high] == sum) {
				System.out.println("pair found");
				return;
			}
			if(arr[min] + arr[high]<sum) {
				min++;
			}else
				high--;
		}
		System.out.println("pair not found");
	}
	public static void sumOfArray(int arr[],int sum) {
		System.out.println(sum);
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(sum - arr[i])) {
				System.out.println("pair found at "+map.get(sum - arr[i])+" & "+i);
			}
			map.put(arr[i], i);
			System.out.println(map);
		}
	}
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int sum = 10;
		findPair(arr,sum);
		sumOfArray(arr,11);
		
		

	}

}
