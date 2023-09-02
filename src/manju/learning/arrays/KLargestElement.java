package manju.learning.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KLargestElement {

	public static void main(String[] args) {
		int arr[] = { 3,2,3,1,2,4,5,5,6};
		System.out.println("max profit in array: " + largestNumber(arr, 4));
		System.out.println("max profit in array: " + largestNumber2(arr, 4));

	}

//Given an integer array nums and an integer k, return the kth largest element in the array.

//Note that it is the kth largest element in the sorted order, not the kth distinct element.

//Can you solve it without sorting?	

//	Input: nums = [3,2,1,5,6,4], k = 2
//	Output: 5 

//	Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//	Output: 4

	// using min heap ( priority queue)
	public static int largestNumber(int[] array, int k) {
		Queue<Integer> que = new PriorityQueue<>();
		for (int i = 0; i < array.length; i++) {
			que.add(array[i]);
			if(que.size() > k) {
				que.remove(que.peek());
			}
		}
		return que.peek();
	}
	
	public static int largestNumber2(int[] array, int k) {
		Arrays.sort(array);
		return array[array.length -k];
	}

}
