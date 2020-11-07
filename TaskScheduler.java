package project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
	public static int leastInterval(char[] tasks,int n) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c : tasks) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
		maxHeap.addAll(map.values());
		
		int cycles = 0;
		while(!maxHeap.isEmpty()) {
			List<Integer> temp = new ArrayList<>();
			for(int i=0;i<n+1;i++) {
				if(!maxHeap.isEmpty()) {
					temp.add(maxHeap.remove());
				}
			}
			for(int i : temp) {
				if(--i > 0) {
					maxHeap.add(i);
				}
			}
			cycles += maxHeap.isEmpty() ? temp.size():n+1;
		}
		return cycles;
	}

	public static void main(String[] args) {
		char[] tasks = {'A','A','A','B','B','B'};
		int n = 2;
		System.out.println(leastInterval(tasks,n));
	}

}
