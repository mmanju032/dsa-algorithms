package manju.learning.stackqueue;

import java.util.Stack;

public class LongestValidSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given a string consisting of opening and closing parenthesis, find the length
		 * of the longest valid parenthesis substring.
		 */
		/*
		 * Input : ((() Output : 2 Explanation : () Input: )()()) Output : 4
		 * Explanation: ()() Input: ()(())))) Output: 6 Explanation: ()(())
		 */

		String str = "))";

		System.out.println("length of longest valid substring:" + longestValidSubString(str));

	}

	private static int longestValidSubString(String str) {
		// TODO Auto-generated method stub

		int maxLength = 0;
		
		Stack<Character> charStack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);

			if (key == '(') {
				charStack.push(key);

			} else if (key == ')') {
				if(!charStack.isEmpty() && charStack.pop() == '(') {
					maxLength += 2;					
				}
			}

		}
		return maxLength;
	}

}
