package com.ravi.datastructures;

public class TreeNode<T> {

	TreeNode<T> left;
	TreeNode<T> right;
	T data;

	public TreeNode(T data) {
		this.data = data;
		// TODO Auto-generated constructor stub
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
}
