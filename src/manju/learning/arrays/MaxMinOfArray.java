package manju.learning.arrays;

public class MaxMinOfArray {

	// Given an array of size N. The task is to find the maximum and the minimum
	// element of the array using the minimum number of comparisons.

	public void maxOfArray(int[] array) {

		int max = array[0];
		int min = array[0];

		for (int i = 1; i <= array.length; i++) {
			if (array[i - 1] > max) {
				max = array[i - 1];
			}
			if (array[i - 1] < min) {
				min = array[i - 1];
			}

		}

		System.out.println("Max value:::" + max);
		System.out.println("Min value:::" + min);

	}

	public int minOfArray(int[] array) {
		int min = array[0];

		for (int i = 1; i <= array.length; i++) {
			if (array[i - 1] < min) {
				min = array[i - 1];
			}

		}
		return min;

	}
}
