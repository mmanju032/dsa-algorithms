package manju.learning.arrays.sliding;

public class MaxSumOfKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

/*		
		Input  : arr[] = {100, 200, 300, 400}, k = 2
				Output : 700

				Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
				Output : 39
				We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.

				Input  : arr[] = {2, 3}, k = 3
				Output : Invalid
				There is no subarray of size 3 as size of whole array is 2.
*/				
				
		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		System.out.println("max sum: " + maxSumOfConsecutiveElements(arr,k));
		System.out.println("max sum using sliding: " + maxSumOfConsecutiveElements2(arr,k));
		
	}

	private static int maxSumOfConsecutiveElements(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		//brute force:
		int maxSum=0;	
		for (int i=0;i < arr.length- k+1 ;i++) {
			int currSum=0;
			for (int j=0;j <k;j++) {
				currSum += arr[i+j] ;	
			}
			maxSum = Math.max(maxSum, currSum);			
		}
		return maxSum;
		
	}
	
	private static int maxSumOfConsecutiveElements2(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		//sliding window
		int maxSum=0;
		for (int i=0;i < k ;i++) {
			maxSum += arr[i]; 
		}
		int windowSum = maxSum; 
		for(int j=k;j<arr.length ;j++) {
			windowSum +=  arr[j] - arr[j-k] ; 
			maxSum = Math.max(maxSum, windowSum);			
		}
		return maxSum;
		
	}

}
