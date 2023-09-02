package manju.learning.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue1 = new LinkedList<>();
		queue1.add(10);
		queue1.add(20);
		queue1.add(30);
		queue1.add(40);
		queue1.add(50);

		int k = 3;

		queue1 = reverseKElementts(queue1, k);
		while (!queue1.isEmpty()) {

			System.out.print(queue1.poll() + "->");

		}

	}

	private static Queue<Integer> reverseKElementts(Queue<Integer> queue1, int k) {
		Stack<Integer> tempStack = new Stack<>();

		for (int i = 0; i < k; i++) {
			tempStack.push(queue1.poll());
		}

		while (!tempStack.isEmpty()) {
			queue1.add(tempStack.pop());
		}

		for (int i = 0; i < queue1.size() - k; i++) {
			queue1.add(queue1.poll());
		}
		return queue1;

	}

}
