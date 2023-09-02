package manju.learning.arrays;

import java.util.Arrays;

public class ChocolateDist {
	
	public static void main(String[] args) {
		int arr[] = {7, 3, 2, 4, 9, 12, 56} ;
		System.out.println("min difference in array: "+ minDifference(arr,3));
	
	}

//Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

//Each student gets one packet.
//The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.	

//	Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
//			Output: Minimum Difference is 2 
	
//	Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
//			Output: Minimum Difference is 6 

	public static int minDifference(int[] array, int target) {
		int min = Integer.MAX_VALUE;
		Arrays.sort(array);
		for (int i = 0; i < array.length-target; i++) {
			if (array[target+i-1] - array[i] < min) {
				min = array[target+i-1] - array[i];
			}
		}

		return min;
	}
}
