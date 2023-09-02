package manju.learning.tries;

public class CountUniqueSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "apple";
		TrieDSA1 trie = new TrieDSA1();

		System.out.println("count of unique substring ? " + trie.countUnqueueSubString(word));

	}

}

class TrieDSA1{
	
	Node root = new Node();

	public int countUnqueueSubString(String word) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<word.length();i++) {
			count=insertTrie(word.substring(i),count);				
		}
		return count+1;
	}

	private int insertTrie(String substring,int count) {
		Node curr = root;
		for(int i=0; i<substring.length();i++) {
			int idx= substring.charAt(i) - 'a';
			if(curr.children[idx] == null) {
				curr.children[idx] = new Node();
				count++;
			}
			curr = curr.children[idx];			
		}
		return count;
		
	}
	
	
	
}
