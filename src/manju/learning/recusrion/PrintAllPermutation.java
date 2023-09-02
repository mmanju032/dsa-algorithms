package manju.learning.recusrion;

public class PrintAllPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc";
		printPerm(str, "");
	}

	private static void printPerm(String str, String perm) {

		if (str.length() == 0) {
			System.out.println(perm);
			return;

		}
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i + 1);

			printPerm(newStr, perm + currChar);
			
		}

	}

}
