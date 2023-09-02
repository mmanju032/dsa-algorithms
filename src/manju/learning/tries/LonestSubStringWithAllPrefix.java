package manju.learning.tries;

public class LonestSubStringWithAllPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "a", "banana", "app", "ap", "appl","apply" ,"apple"  };
		TrieDSA2 trie = new TrieDSA2();
		for(String word: words) {
			trie.insertTrie(word);
		}
		
		
		trie.longestSubstring(trie.root, new StringBuilder(""));
		System.out.println("longest substring:: " + trie.ans);

	}

}

class TrieDSA2{
	Node root = new Node();
	String ans="";
	
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
	
	public void longestSubstring(Node root,StringBuilder temp) {
				
		if(root==null) {
			return;
		}

		for(int i=0;i<26;i++) {
			if(root.children[i] !=null && root.children[i].eow == true) {
				temp.append( (char) (i+'a'));
				if(temp.length() > ans.length()) {
					ans = temp.toString();
				}
				longestSubstring(root.children[i],temp);
				temp.deleteCharAt(temp.length()-1);				
			}

			
		}

		
	}
}
