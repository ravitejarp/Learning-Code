package com.ravi.job;

import java.awt.List;
import java.util.ArrayList;

public class RemoveNodes {
	static int lefSize = 0;
	int rightSize = 0;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	int[] arr, arr1;
	TreeNode currentLeft;
	TreeNode currentRight;

	public void removeNode(TreeNode root) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int leftSize(TreeNode root) {
		if (root == null)
			return (0);
		else
			return (leftSize(root.left));

	}

	public int rightSize(TreeNode root) {
		if (root == null)
			return (0);
		else
			return (rightSize(root.right));

	}

	int i = 0;

	public void traversal(TreeNode root) {
		if (root != null) {
			if (root.left != null) {
				lefSize++;
				currentLeft = root;
				traversal(root.left);
			}
			if (root.right != null) {
				rightSize++;
				currentRight = root;
				traversal(root.right);
			}

			if (root.left == null && root.right == null) {
				arr[i] = lefSize;
				arr1[i] = rightSize;
				i++;
				traversalright(currentLeft);
				traversalleft(currentRight);
			}
		}
	}

	public void traversalleft(TreeNode root) {
		if (root != null) {
			if (root.left != null) {
				lefSize++;
				currentLeft = root;
				traversal(root.left);
			}

		}
	}

	public void traversalright(TreeNode root) {
		if (root != null) {
			if (root.right != null) {
				rightSize++;
				currentRight = root;
				traversal(root.right);
			}
		}
	}
}
