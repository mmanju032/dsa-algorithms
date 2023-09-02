package manju.learning.arrays;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 3, 7, 9, 15, 4, 50, -6 };

		MaxMinOfArray maxminArray = new MaxMinOfArray();

		maxminArray.maxOfArray(array);
		
		ReverseArray reverse = new ReverseArray();
		int[] array1 = new int[10000000];
		for(int i = 0; i<10000000; i++) {
			array1[i] = i;
		}
		reverse.reverse(array1);
		long start= System.nanoTime();
		reverse.rotate(array1, 0);
		long end= System.nanoTime();
		System.out.println("reverse using while took " +  (end-start) + " ns");
	}

}
