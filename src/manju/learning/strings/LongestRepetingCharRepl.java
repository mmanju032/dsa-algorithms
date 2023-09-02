package manju.learning.strings;

public class LongestRepetingCharRepl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * You are given a string s and an integer k. You can choose any character of
		 * the string and change it to any other uppercase English character. You can
		 * perform this operation at most k times.
		 * 
		 * Return the length of the longest substring containing the same letter you can
		 * get after performing the above operations.
		 */

		/*
		 * Input: s = "ABAB", k = 2 Output: 4 Explanation: Replace the two 'A's with two
		 * 'B's or vice versa.
		 */

		/*
		 * Input: s = "AABABBA", k = 1 Output: 4 Explanation: Replace the one 'A' in the
		 * middle with 'B' and form "AABBBBA". The substring "BBBB" has the longest
		 * repeating letters, which is 4. There may exists other ways to achive this
		 * answer too.
		 */
		
		String str = "AABABBA";
		int k =1;
		System.out.println("longest repeat char count:" + characterReplacement(str,k));

	}
	
	public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int mostFreqLetter = 0;
        int left = 0;
        int max = 0;
        
        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;
            mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(right) - 'A']);
            
            int lettersToChange = (right - left + 1) - mostFreqLetter;
            if(lettersToChange > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }

}
