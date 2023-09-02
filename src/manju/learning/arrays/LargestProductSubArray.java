package manju.learning.arrays;

public class LargestProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 3,-2,-1, 4};
		System.out.println("max profit in array: " + maxProduct(arr));

	}

	public static int maxProduct(int[] nums) {

		int max = nums[0], min = nums[0], ans = nums[0];
		int n = nums.length;
		for (int i = 1; i < n; i++) {

//			 Swapping min and max
			if (nums[i] < 0) {
				int temp = max;
				max = min;
				min = temp;
			}

			max = Math.max(nums[i], max * nums[i]);
			min = Math.min(nums[i], min * nums[i]);

			ans = Math.max(ans, max);
		}

		return ans;

	}
}
