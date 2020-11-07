package project1;

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
