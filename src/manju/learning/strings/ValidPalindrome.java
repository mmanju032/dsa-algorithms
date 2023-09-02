package manju.learning.strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * A phrase is a palindrome if, after converting all uppercase letters into
		 * lowercase letters and removing all non-alphanumeric characters, it reads the
		 * same forward and backward. Alphanumeric characters include letters and
		 * numbers.
		 * 
		 * Given a string s, return true if it is a palindrome, or false otherwise.
		 */

		/*
		 * Input: s = "A man, a plan, a canal: Panama" Output: true Explanation:
		 * "amanaplanacanalpanama" is a palindrome.
		 */
		
		String str= "A man, a plan, a canal: Panama";
		System.out.println("valid palindrome::" + isPalindrome(str));
		System.out.println("valid palindrome2::" + isPalindrome2("nanan"));

	}

	private static boolean isPalindrome(String str) {
		
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.print(str);
		
		StringBuilder build = new StringBuilder(str);
		return str.equalsIgnoreCase(build.reverse().toString());
		
	}
	
	private static boolean isPalindrome2(String str) {
		
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		int start = 0,end=str.length()-1;
		
		while(start <= end) {
			
			char starchar = str.charAt(start);
			char endchar = str.charAt(end);
			
			if(!Character.isLetterOrDigit(starchar)) {
				start++;
			} else if (!Character.isLetterOrDigit(endchar)) {
				end++;
			} else {
				if(str.charAt(start) != str.charAt(end)) {
					return false;
				}
			}
			start++;
			end--;
			
		}
		return true;
		
	}

}
