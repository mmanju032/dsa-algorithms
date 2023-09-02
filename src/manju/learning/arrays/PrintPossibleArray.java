package manju.learning.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class PrintPossibleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Given an array of size n, generate and print all possible combinations of r
		// elements in array.
		// For example, if input array is {1, 2, 3, 4} and r is 2, then output should be
		// {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}.

		int[] array = { 1, 2,3};
		int r = 2;
//		printPossibleArraySize(array, r); // wrong
		Set<List<Integer>> subarrays = new HashSet<>();
		printPossibleArraySize2(array, r, 0, new ArrayList<Integer>(), subarrays);
		System.out.println(subarrays);

	}

	private static void printPossibleArraySize(int[] array, int r) {

		Set<Integer> outList = new HashSet<>();
		Queue<Integer> outqueue = new LinkedList<>();

		for (int i = 0; i < array.length; i++) {
			outList.clear();
			outList.add(array[i]);
			for (int j = i + 1; j < array.length; j++) {
				outqueue.add(array[j]);
				if (outqueue.size() == r - 1) {
					outList.addAll(outqueue);
					System.out.println("output" + outList);
					outqueue.poll();
					outList.clear();
					outList.add(array[i]);

				}

			}
			outqueue.clear();

		}

	}

	private static void printPossibleArraySize2(int[] array, int r, int i, List<Integer> out,
			Set<List<Integer>> subarrays) {
		System.out.println("************** " + " i=" + i + " r=" + r);

		if (array.length == 0 || r > array.length) {
			return;
		}

		if (r==0) {
			subarrays.add(new ArrayList<>(out));
			return;
		}

		for (int j = i; j < array.length; j++) {
			out.add(array[j]);
			System.out.println("index before recursion::" + " j=" + j + " r=" + r);
			printPossibleArraySize2(array, r - 1, j + 1, out, subarrays);
			System.out.println("index after recursion::" + " j=" + j + " r=" + r);
			out.remove(out.size() - 1); // backtrack
		}

	}
	
	

}
