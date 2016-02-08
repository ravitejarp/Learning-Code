package com.ravi.datastructures;

public class PreOrderDFS {
	public void preOrder(TreeNode root) {
		if (root == null)
			return;
		System.out.println(root.data);
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
}
