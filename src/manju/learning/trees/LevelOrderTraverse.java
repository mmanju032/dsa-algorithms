package manju.learning.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Given the root of a binary tree, return the level order traversal of its
		 * nodes' values. (i.e., from left to right, level by level).
		 */

		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node root = new BinaryTree().buildTreeNode(nodes);

//		new BinaryTree().levelOrder(root);
		List<List<Integer>> ans = new BinaryTree().zigzagLevelOrder(root);
		System.out.println(ans);

	}

}

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree {

	Node root;
	int idx = -1;

	public Node buildTreeNode(int[] nodes) {
		{
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTreeNode(nodes);
			newNode.right = buildTreeNode(nodes);
			return newNode;

		}

	}

	public void levelOrder(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}

		Queue<Node> que = new LinkedList<>();
		que.offer(root);
		que.offer(null); // for next line;

		while (!que.isEmpty()) {

			Node currNode = que.poll();
			if (currNode != null) {
				System.out.print(currNode.data + " ");
				if (currNode.left != null) {
					que.offer(currNode.left);
				}
				if (currNode.right != null) {
					que.offer(currNode.right);
				}
			} else {
				System.out.println();
				if (que.isEmpty()) {
					break;
				} else {
					que.offer(null);
				}

			}

		}

	}

	public List<List<Integer>> zigzagLevelOrder(Node root) {
		
		ArrayList<Integer> finalAns = new ArrayList<>();

		List<List<Integer>> ans = new ArrayList<>();
		Queue<Node> s = new LinkedList<>();

		if (root == null) {
			return ans;
		}

		s.offer(root);
		// s.push(null);
		boolean flag = false;

		while (!s.isEmpty()) {
			int size = s.size();
			List<Integer> value = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				Node curr = s.poll();

                if(curr.left!=null)
                  s.add(curr.left);
                if(curr.right!=null)
                  s.add(curr.right);

                value.add(curr.data);

			}
	        if(flag == true)
	           Collections.reverse(value);
	            
	        flag = !flag;
			ans.add(value);

		}
		System.out.println(ans);
		
        while(!ans.isEmpty()){
            
            for(List<Integer> val: ans){
            	if(val.size() > 0) {
                    finalAns.add(val.get(val.size()-1));
                    val.remove(val.size()-1);
            	}

               
            }
            System.out.println(finalAns);
            
        }
        
        System.out.println(finalAns);
		return ans;

	}

}
