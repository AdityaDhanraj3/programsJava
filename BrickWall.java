package project1;
/**
 * There is a brick wall in front of you. The wall is rectangular and has several rows of bricks.
 *  The bricks have the same height but different width. You want to draw a vertical line from the top to the bottom and cross the least bricks.

The brick wall is represented by a list of rows. Each row is a list of integers representing the width of each brick in this row from left to right.

If your line go through the edge of a brick, then the brick is not considered as crossed.
 You need to find out how to draw the line to cross the least bricks and return the number of crossed bricks.

You cannot draw a line just along one of the two vertical edges of the wall,
 in which case the line will obviously cross no bricks.

Example:

Input: [[1,2,2,1],
        [3,1,2],
        [1,3,2],
        [2,4],
        [3,1,2],
        [1,3,1,1]]

Output: 2

 * @author adity
 *
 */
public class BrickWall {

	private static int leastNumber(int[][] array, int width) {
		// TODO Auto-generated method stub
		int[] hash = new int[width + 1]; // HashSet to store the occurrences of edges
		int max = 0;
		// iterating over input array
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				array[i][j] = sum; // replacing the actual values with the position of edges
				hash[sum] += 1; // storing the occurrences of edges.
			}
		}
		// Loop to iterate over the input array which now contains the position of edges
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length - 1; j++) { // excluding the last element in the row
				int ele = array[i][j];
				int val = hash[ele]; // retrieving the occurrence of the edge from hash array
				if (val > max)
					max = val; // finding the maximum of occurrences of all edges
			}
		}
		return array.length - max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = { { 3, 5, 1, 1 }, { 2, 3, 3, 2 }, { 5, 5 }, { 4, 4, 2 }, { 1, 3, 3, 3 }, { 1, 1, 6, 1, 1 } };
		int width = 10;
		System.out.println(leastNumber(array, width));

	}

}
