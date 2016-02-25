package com.ravi.datastructures;

public class TreeNodeCA<T> {
	private TreeNodeCA<T> left;
	private TreeNodeCA<T> right;
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public TreeNodeCA<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNodeCA<T> left) {
		this.left = left;
	}

	public TreeNodeCA<T> getRight() {
		return right;
	}

	public void setRight(TreeNodeCA<T> right) {
		this.right = right;
	}

}
