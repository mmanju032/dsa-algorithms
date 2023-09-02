package manju.learning.arrays.sliding;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Given an integer array nums, find the subarraywith the largest sum, and
		// return its sum.

		/*
		 * 
		 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: The subarray
		 * [4,-1,2,1] has the largest sum 6.
		 */
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println("max subarray:: " + maxSubArray(nums));

	}

	private static int maxSubArray(int[] nums) {
		
		int currSum = nums[0];
		int max = currSum;
		

		for (int i = 1; i < nums.length; i++) {
			currSum = Math.max(nums[i], currSum + nums[i]);
			max = Math.max(max, currSum);

		}
		return max;

	}

}
