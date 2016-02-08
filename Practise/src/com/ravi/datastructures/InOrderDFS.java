package com.ravi.datastructures;

public class InOrderDFS<T> {
	public void inOrder(TreeNode<T> node) {
		if (node == null)
			return;
		inOrder(node.getLeft());
		System.out.println(node.data);
		inOrder(node.getRight());
	}
	public void postOrder(TreeNode<T> node) {
		if (node == null)
			return;
		inOrder(node.getLeft());
		inOrder(node.getRight());
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		InOrderDFS<Integer> dfs = new InOrderDFS<Integer>();
		TreeNode<Integer> root = new TreeNode<Integer>(25);
		TreeNode<Integer> node = new TreeNode<Integer>(26);
		root.setLeft(node);
		TreeNode<Integer> node2 = new TreeNode<Integer>(28);
		node.setLeft(node2);
		TreeNode<Integer> node1 = new TreeNode<Integer>(27);
		root.setRight(node1);
		dfs.inOrder(root);
		System.out.println("=====================");
		dfs.postOrder(root);

	}
}
