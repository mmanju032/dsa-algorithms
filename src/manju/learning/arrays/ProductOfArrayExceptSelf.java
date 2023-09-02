package manju.learning.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given an integer array nums, return an array answer such that answer[i] is
		 * equal to the product of all the elements of nums except nums[i].
		 * 
		 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
		 * integer.
		 * 
		 * You must write an algorithm that runs in O(n) time and without using the
		 * division operation.
		 * 
		 * 
		 */

		/*
		 * Input: nums = [1,2,3,4] Output: [24,12,8,6]
		 */
		int[] nums = {1,2,3,4};
		nums=priductArrayExceptSelf2(nums);
		for(int i: nums) {
			System.out.print(i + " ");
		}

	}
//brute-force
	private static int[] priductArrayExceptSelf(int[] nums) {
		// TODO Auto-generated method stub
		int[] out = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int product = 1;
			for(int j=0;j<nums.length;j++) {
				if(i!=j) {
					product = product*nums[j];
				}
			}
			out[i] = product;
			
		}
		return out;
	}
	
	private static int[] priductArrayExceptSelf2(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {       	
            ans[i] *= curr;
            curr *= nums[i];
            
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
        	
            ans[i] *= curr;
            curr *= nums[i];
            
        }
        return ans;
	}

}
