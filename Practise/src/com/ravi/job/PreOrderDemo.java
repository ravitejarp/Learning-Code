package com.ravi.job;

import java.util.Stack;

public class PreOrderDemo {

	public static class TreeNode1 {
		int data;
		TreeNode1 left;
		TreeNode1 right;

		TreeNode1(int data) {
			this.data = data;
		}
	}

	public void preordeRecursion(TreeNode1 root) {
		if (root != null) {
			System.out.println("Data is" + root.data);
			preordeRecursion(root.left);
			preordeRecursion(root.right);
		}
	}

	public void preOrderIteration(TreeNode1 root) {

		if (root == null)
			return;

		Stack<TreeNode1> stack = new Stack<TreeNode1>();
		stack.push(root);
		while (!stack.empty()) {
			TreeNode1 n = stack.pop();
			System.out.println(n.data);
			if (n.right != null)
				stack.push(n.right);
			if (n.left != null)
				stack.push(n.left);

		}
	}

	public static void main(String[] args) {
		PreOrderDemo bT = new PreOrderDemo();
		TreeNode1 rootNode = createBinaryTree();
		bT.preordeRecursion(rootNode);
		bT.preOrderIteration(rootNode);
	}

	public static TreeNode1 createBinaryTree() {
		TreeNode1 rootNode = new TreeNode1(40);
		TreeNode1 node10 = new TreeNode1(10);
		TreeNode1 node20 = new TreeNode1(20);
		TreeNode1 node30 = new TreeNode1(30);
		TreeNode1 node50 = new TreeNode1(50);
		TreeNode1 node60 = new TreeNode1(60);
		TreeNode1 node70 = new TreeNode1(70);

		rootNode.left = node30;
		rootNode.right = node60;

		node30.left = node10;
		node30.right = node20;

		node60.left = node50;
		node60.right = node70;

		return rootNode;

	}

}
