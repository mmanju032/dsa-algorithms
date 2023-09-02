package manju.learning.trees;

public class SubTreeOfAnotherTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node mainRoot = new BinaryTree().buildTreeNode(nodes);

		int nodes1[] = { 2, 4, -1, -1, 5,-1,-1 };
		Node subRoot = new BinaryTree().buildTreeNode(nodes1);

		System.out.println("is Subtree:" + isSubTree(mainRoot, subRoot));

	}

	private static boolean isSubTree(Node mainRoot, Node subRoot) {
		// TODO Auto-generated method stub

		if (subRoot == null) {
			return true;
		}

		if (mainRoot == null) {
			return false;
		}

		if (mainRoot.data == subRoot.data) {
			if (isIdentical(mainRoot, subRoot)) {
				return true;
			}

		}
		return isSubTree(mainRoot.left, subRoot) || isSubTree(mainRoot.right, subRoot);

	}

	private static boolean isIdentical(Node mainRoot, Node subRoot) {
		// TODO Auto-generated method stub
		if (mainRoot == null && subRoot == null) {
			return true;
		}
		if (mainRoot == null || subRoot == null) {
			return false;
		}
		return isIdentical(mainRoot.left, subRoot.left) && isIdentical(mainRoot.right, subRoot.right);
	}

}
