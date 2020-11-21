package project1;
/**
 * Given an array of integers nums and an integer target, return indices of the
 two numbers such that they add up to target.
 
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
 */
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
