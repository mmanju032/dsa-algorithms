package manju.learning.stackqueue;

import java.util.Stack;

public class DuplicateParenthisCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given a balanced expression, find if it contains duplicate parenthesis or
		 * not. A set of parenthesis are duplicate if the same subexpression is
		 * surrounded by multiple parenthesis.
		 * 
		 * Examples:
		 * 
		 * Below expressions have duplicate parenthesis - ((a+b)+((c+d))) The
		 * subexpression "c+d" is surrounded by two pairs of brackets.
		 * 
		 * (((a+(b)))+(c+d)) The subexpression "a+(b)" is surrounded by two pairs of
		 * brackets.
		 * 
		 * (((a+(b))+c+d)) The whole expression is surrounded by two pairs of brackets.
		 */

		String str = "(((a+b))+(c+d))";
		System.out.println("contains duplicate parenthisis ? " + dupParenthisCheck(str));

	}

	private static boolean dupParenthisCheck(String str) {
		// TODO Auto-generated method stub

		Stack<Character> charstack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);

			if (key != ')') {
				charstack.push(key);
			} else {
				int count = 0;
				char check = charstack.peek();
				while (check != '(') {
					check = charstack.pop();
					count++;

				}
				if (count <= 1) {
					return true;

				}
			}
		}

		return false;
	}

}
