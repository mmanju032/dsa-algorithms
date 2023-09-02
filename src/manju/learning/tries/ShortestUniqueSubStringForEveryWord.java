package manju.learning.tries;

public class ShortestUniqueSubStringForEveryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Given an array of words, find all shortest unique prefixes to represent each
		 * word in the given array. Assume that no word is prefix of another.
		 */

		/*
		 * Examples:
		 * 
		 * 
		 * Input: arr[] = {"zebra", "dog", "duck", "dove"} Output: dog, dov, du, z
		 * Explanation: dog => dog dove => dov duck => du zebra => z
		 * 
		 * Input: arr[] = {"geeksgeeks", "geeksquiz", "geeksforgeeks"}; Output: geeksf,
		 * geeksg, geeksq}
		 */
		String[] words = { "zebra", "dog", "duck", "dove" };
		TrieDSA3 trie = new TrieDSA3();
		for (String word : words) {
			trie.insertTrie(word);
		}
		trie.shortestUniqueSubString(trie.root, new StringBuilder(""));

	}

}

class TrieDSA3 {
	Node3 root = new Node3();

	public void insertTrie(String word) {
		Node3 curr = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				curr.children[idx] = new Node3();
				curr.children[idx].freq++;
			} else {
				curr.children[idx].freq++;
			}
			curr = curr.children[idx];
		}
	}

	public void shortestUniqueSubString(Node3 root, StringBuilder temp) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		if (root.freq == 1) {
			System.out.println(temp);
			return;
		}

		for (int i = 0; i < 26; i++) {
			if (root.children[i] != null) {
				if (root.children[i].freq > 1 || root.children[i].freq == 0) {
					temp.append((char) (i + 'a'));
					shortestUniqueSubString(root.children[i], temp);
//					root.children[i] = null;
					temp.deleteCharAt(temp.length() - 1);
				} else {
					temp.append((char) (i + 'a'));
					shortestUniqueSubString(root.children[i], temp);
//					root.children[i] = null;
					temp.deleteCharAt(temp.length() - 1);
				}

			}

		}

	}

}

class Node3 {
	Node3[] children;
	int freq;

	Node3() {
		children = new Node3[26];
		for (int i = 0; i < 26; i++) {
			children[i] = null;
		}
		freq = 0;

	}
}
