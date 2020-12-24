package project1;

/**
 * Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task.
 Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.

However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array), that is that there must be at least n units of time between any two same tasks.

Return the least number of units of times that the CPU will take to finish all the given tasks.

 

Example 1:

Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation: 
A -> B -> idle -> A -> B -> idle -> A -> B
There is at least 2 units of time between any two same tasks.
Example 2:

Input: tasks = ["A","A","A","B","B","B"], n = 0
Output: 6
Explanation: On this case any permutation of size 6 would work since n = 0.
["A","A","A","B","B","B"]
["A","B","A","B","A","B"]
["B","B","B","A","A","A"]
...
And so on.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
/**
 * Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task.
 *  Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.

However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array),
 that is that there must be at least n units of time between any two same tasks.

Return the least number of units of times that the CPU will take to finish all the given tasks.

 

Example 1:

Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation: 
A -> B -> idle -> A -> B -> idle -> A -> B
There is at least 2 units of time between any two same tasks.
Example 2:

Input: tasks = ["A","A","A","B","B","B"], n = 0
Output: 6
Explanation: On this case any permutation of size 6 would work since n = 0.
["A","A","A","B","B","B"]
["A","B","A","B","A","B"]
["B","B","B","A","A","A"]
...
And so on.
Example 3:

Input: tasks = ["A","A","A","A","A","A","B","C","D","E","F","G"], n = 2
Output: 16
Explanation: 
One possible solution is
A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle -> A
 * @author adity
 *
 */
public class TaskScheduler {
	public static int leastInterval(char[] tasks, int n) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : tasks) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
		maxHeap.addAll(map.values());

		int cycles = 0;
		while (!maxHeap.isEmpty()) {
			List<Integer> temp = new ArrayList<>();
			for (int i = 0; i < n + 1; i++) {
				if (!maxHeap.isEmpty()) {
					temp.add(maxHeap.remove());
				}
			}
			for (int i : temp) {
				if (--i > 0) {
					maxHeap.add(i);
				}
			}
			cycles += maxHeap.isEmpty() ? temp.size() : n + 1;
		}
		return cycles;
	}

	public static void main(String[] args) {
		char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
		int n = 2;
		System.out.println(leastInterval(tasks, n));
		char[] tasks1 = { 'A', 'A', 'A', 'B', 'B', 'B' };
		int n1 = 3;
		System.out.println(leastInterval(tasks1, n1));

	}

}


OUTPUT :
8
10
