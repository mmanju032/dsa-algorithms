package manju.learning.tries;

public class ConstructTrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "the", "a", "there", "their", "any" };
		Trie trie = new Trie();
		for (String word : words) {
			trie.insertTrie(word);
		}
		String word="their";
		System.out.println(word + " exists in trie ? " + trie.searchWord(word));
		
	}

}

class Trie {
	Node root = new Node();

	public void insertTrie(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				curr.children[idx] = new Node();
			}

			if (i == word.length() - 1) {
				curr.children[idx].eow = true;
			}

			curr = curr.children[idx];
		}
	}
	
	public boolean searchWord(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				return false;
			}

			if (i == word.length() - 1 && curr.children[idx].eow == false) {
				return false;
			}

			curr = curr.children[idx];
		}
		return true;
	}

}

class Node {
	Node[] children;
	boolean eow;

	Node() {
		children = new Node[26];
		for (int i = 0; i < 26; i++) {
			children[i] = null;
		}
		eow = false;

	}
}
