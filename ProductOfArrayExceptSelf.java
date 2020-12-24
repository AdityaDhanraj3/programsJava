package project1;
/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n)
 * @author adity
 *
 */
public class ProductOfArrayExceptSelf {
	public static int[] productArrayExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		left[0] = 1;
		right[nums.length - 1] = 1;
		for (int i = 0; i < nums.length-1; i++) {
          left[i+1] = nums[i]*left[i];

		}
		for (int i = nums.length-1; i > 0; i--) {
			right[i - 1] = nums[i] * right[i];
		}
		for (int i = 0; i < nums.length; i++) {
			result[i] = right[i] * left[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 4 };
		int[] pe = productArrayExceptSelf(nums);
		for (int i = 0; i < pe.length; i++) {
			System.out.println(pe[i]);
		}

	}

}

OUTPUT :
12
8
6
