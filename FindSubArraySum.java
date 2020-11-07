package project1;

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
