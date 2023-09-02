package manju.learning.trees;

public class DiameterOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node root = new BinaryTree().buildTreeNode(nodes);
		System.out.println("daimeter of tree is : " + new BinaryTreeDiam().diameterOfTree(root));
		System.out.println("daimeter of tree is : " + new BinaryTreeDiam().diameterOfTree2(root).daim);

	}

}

class BinaryTreeDiam {

	public int diameterOfTree(Node root) {
		if (root == null) {
			return 0;
		}

		int ldm = diameterOfTree(root.left);
		int rdm = diameterOfTree(root.right);
		int ht = heightOfNodes(root.left) + heightOfNodes(root.right) + 1;
		return Math.max(Math.max(ldm, rdm), ht);

	}

	public DaimNode diameterOfTree2(Node root) {
		if (root == null) {
			return new DaimNode(0,0);
		}

		DaimNode ldm = diameterOfTree2(root.left);
		DaimNode rdm = diameterOfTree2(root.right);
		int myHeight = Math.max(ldm.ht , rdm.ht) + 1;
		
		int daim1=ldm.daim;
		int daim2=rdm.daim;
		int daim3 = ldm.ht+ rdm.ht + 1;
		int myDaim = Math.max(Math.max(daim1, daim2),daim3);
		DaimNode newDaimNode = new DaimNode(myHeight,myDaim);
		
		return newDaimNode;

	}

	public int heightOfNodes(Node root) {

		if (root == null) {
			return 0;
		}
		return Math.max(heightOfNodes(root.left), heightOfNodes(root.right)) + 1;

	}

}

class DaimNode {
	int ht;
	int daim;

	DaimNode(int ht, int daim) {
		this.ht = ht;
		this.daim = daim;
	}
}
