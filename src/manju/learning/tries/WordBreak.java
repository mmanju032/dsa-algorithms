package manju.learning.tries;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] wordsBreak = { "i", "like", "sam", "samsung", "penny", "mobile" };
		String key = "ilikesamsung";
		TrieDSA trie = new TrieDSA();
		for (String word : wordsBreak) {
			trie.insertTrie(word);
		}

		System.out.println("is key exists in dictornary ? " + trie.wordBreak(key));

	}

}

class TrieDSA {
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

	public boolean wordBreak(String key) {
		// TODO Auto-generated method stub
		if (key.length() == 0) {
			return true;
		}
		for (int i = 1; i <= key.length(); i++) {
			String firstPart = key.substring(0, i);
			String secondPart = key.substring(i);
			if (searchWord(firstPart) && wordBreak(secondPart)) {
				return true;
			}

		}
		return false;
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

	public void countUnqueueSubString(String word) {
		// TODO Auto-generated method stub
		
	}

}
