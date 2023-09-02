package manju.learning.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcbb";
//		expected ans : "abc"

		System.out.println(longestSubstringLength(str));

	}

	private static int longestSubstringLength(String str) {
		// TODO Auto-generated method stub

		Map<Character, Integer> charMap = new LinkedHashMap<>();
		int len = str.length();
		String longest;
		int maxLength = 0;
		int left=0;
		StringBuilder temp = new StringBuilder();

		for (int right = 0; right < len; right++) {
			char key = str.charAt(right);

			if (!charMap.containsKey(key) || charMap.get(key) < left) {
				charMap.put(key, right);
				maxLength= Math.max(maxLength, right-left +1 );

			} else {
				left = charMap.get(key) +1;
				charMap.put(key, right);
			}

		}
		
		return maxLength;

	}

}
