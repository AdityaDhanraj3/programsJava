package project1;
/**
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1,
 *  find the area of largest rectangle in the histogram.

Example:

Input: [2,1,5,6,2,3]
Output: 10
 */
import java.util.Stack;

public class MaxRectangleArea {
	public static void largestRectangleArea(int[] height) {
		if(height == null || height.length == 0)
			return;
		Stack<Integer> stack = new Stack<>();
		int max = 0;
		int areaWithTop;
		int i=0;
		while(i<height.length) {
			if(stack.isEmpty() || height[i] >= height[stack.peek()]) {
				stack.push(i);
				i++;
			}else {
				int tp = stack.peek();
				stack.pop();
				areaWithTop = height[tp]*(stack.empty()?i:i-stack.peek()-1);
				if(max < areaWithTop) {
					max = areaWithTop;
				}
			}
		}
		while(stack.empty() == false) {
			int tp = stack.peek();
			stack.pop();
			areaWithTop = height[tp]*(stack.empty()?i:i-stack.peek()-1);
			if(max < areaWithTop) {
				max = areaWithTop;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] height = {6,2,5,4,5,1,6};
		largestRectangleArea(height);
	}

}
