package manju.learning.arrays.sliding;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrraySumdivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given an arr[] containing n integers and a positive integer k. The problem is
		 * to find the longest subarray’s length with the sum of the elements divisible
		 * by the given value k.
		 */

		/*
		 * Input: arr[] = {2, 7, 6, 1, 4, 5}, k = 3 Output: 4 Explanation: The subarray
		 * is {7, 6, 1, 4} with sum 18, which is divisible by 3.
		 * 
		 * Input: arr[] = {-2, 2, -5, 12, -11, -1, 7}, k = 3 Output: 5
		 */

		int arr[] = { 2, 7, 6, 1, 4, 5 }, k = 3;

		System.out.println("max length:" + longestSubarrayLength(arr, k));

	}

	private static int longestSubarrayLength(int[] arr, int k) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		 
        int max_len = 0;
        int sum = 0;

		for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
 
            // to handle negative values as well
            int mod = ((sum % k) + k) % k;
            System.out.println(" mod: " + mod + " i :" + i);
 
            if (mod == 0)
                max_len = i + 1;
 
            if (!map.containsKey(mod))
                map.put(mod, i);
            else {
                int sz = i - map.get(mod);
                max_len = Math.max(max_len, sz);
            }
        }

		return max_len;

	}

}
