package manju.learning.trees;

public class CountOfNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nodes[] = {  1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node root = new BinaryTree().buildTreeNode(nodes);
		System.out.println("count:" + new BinaryTreeCount().countOfNodes(root));
		System.out.println("sum of nodes:" + new BinaryTreeCount().sumOfNodes(root));
		System.out.println("height of nodes:" + new BinaryTreeCount().heightOfNodes(root));

	}

}

class BinaryTreeCount {

	public int countOfNodes(Node root) {

		if (root == null) {
			return 0;
		}
		return countOfNodes(root.left) + countOfNodes(root.right) + 1;

	}
	
	public int sumOfNodes(Node root) {

		if (root == null) {
			return 0;
		}
		return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;

	}
	
	public int heightOfNodes(Node root) {

		if (root == null) {
			return 0;
		}
		return Math.max(heightOfNodes(root.left) , heightOfNodes(root.right)) + 1;

	}

}
