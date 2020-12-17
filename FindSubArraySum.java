package project1;
/**
 * Given a list of non-negative numbers and a target integer k, write a function to check if the array has a continuous
 *  subarray of size at least 2 that sums up to a multiple of k, that is, sums up to n*k where n is also an integer.
Example 1:

Input: [23, 2, 4, 6, 7],  k=6
Output: True
Explanation: Because [2, 4] is a continuous subarray of size 2 and sums up to 6.
 */
import java.util.HashMap;
import java.util.Map;

public class FindSubArraySum {
	public void subArr(int arr[],int sum) {
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);
		int elementSum = 0;
		for(int i=0;i<arr.length;i++) {
			elementSum += arr[i];
			map.putIfAbsent(elementSum, i);
			if(map.containsKey(elementSum - sum)) {
				System.out.println("subArray found between "+(map.get(elementSum - sum)+1)+"....."+i);
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSubArraySum fs = new FindSubArraySum();
		int arr[] = {5,6,-5,5,3,5,-2,0};
		fs.subArr(arr, 13);
	}

}

OUTPUT:
subArray found between 3.....5
