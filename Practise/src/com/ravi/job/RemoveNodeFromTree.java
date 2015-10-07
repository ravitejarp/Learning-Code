package com.ravi.job;

import java.util.ArrayList;
import java.util.List;

public class RemoveNodeFromTree {

	public static class TreeNode {
		int data;
		TreeNode right;
		TreeNode left;

		TreeNode(int data) {
			this.data = data;
		}
	}

	int[] arr;
	int i = 0;

	public void traversal(TreeNode root) {
		if (root != null) {
			arr[i] = root.data;
			i++;
			System.out.println(root.data);
			traversal(root.left);
			traversal(root.right);
		}
	}

	public void nodeRemove(int data, TreeNode root) {
		int length = arr.length;
		for (int j = 0; j < arr.length; j++) {
			while (length != 0) {
				if (root.data == arr[j]) {

				}
			}

		}
	}

	public static void main(String[] args) {

	}

	public TreeNode createTree() {
		TreeNode root = new TreeNode(40);
		return root;
	}

}
