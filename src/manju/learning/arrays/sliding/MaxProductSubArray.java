package manju.learning.arrays.sliding;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given an integer array nums, find a subarray that has the largest product,
		 * and return the product.
		 * 
		 * The test cases are generated so that the answer will fit in a 32-bit integer.
		 */
		/*
		 * Input: nums = [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product
		 * 6.
		 */
		
		int[] nums = {-2,0,-1 };

		System.out.println("max subarray product:: " + maxSubArray(nums));

	}

	private static int maxSubArray(int[] nums) {

		int currProduct = nums[0];
		int max = currProduct;

		for (int i = 1; i < nums.length; i++) {
			currProduct = Math.max(nums[i], currProduct * nums[i]);
			max = Math.max(max, currProduct);

		}
		return max;

	}

}
