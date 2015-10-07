package com.ravi.job;

import java.util.Stack;

import com.ravi.job.DepthOfTree.TreeNode;

public class RemoveNode {

	int x = 1;

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	public void preordeRecursion1(TreeNode root, int[] arr, int i) {
		if (root == null) {
			System.out.println();
			return;
		}

		arr[i] = root.data;
		i++;
		System.out.println("I is:" + i);
		if (root.left == null && root.right == null) {
			for (int j = 0; j < i; j++) {
				System.out.print(arr[j] + "\t");

			}

		} else {
			preordeRecursion1(root.left, arr, i);
			System.out.println();
			preordeRecursion1(root.right, arr, i);

		}
	}

	public static void main(String[] args) {

		RemoveNode bT = new RemoveNode();
		TreeNode rootNode = retrnRoot();
		bT.preordeRecursion1(rootNode, new int[1000], 0);

	}

	public static TreeNode createBinaryTree() {
		TreeNode rootNode = new TreeNode(40);
		TreeNode node10 = new TreeNode(10);
		TreeNode node20 = new TreeNode(20);
		TreeNode node30 = new TreeNode(30);
		TreeNode node50 = new TreeNode(50);
		TreeNode node60 = new TreeNode(60);
		TreeNode node70 = new TreeNode(70);
		TreeNode node90 = new TreeNode(90);

		rootNode.left = node30;
		rootNode.right = node60;

		node30.left = node10;
		node30.right = node20;

		node60.left = node50;
		node60.right = node70;
		node70.left = node90;

		return rootNode;

	}

	public static TreeNode retrnRoot() {
		TreeNode root = new TreeNode(1120);
		TreeNode node20 = new TreeNode(20);
		TreeNode node30 = new TreeNode(30);
		TreeNode node40 = new TreeNode(40);
		TreeNode node50 = new TreeNode(50);
		TreeNode node60 = new TreeNode(60);
		TreeNode node70 = new TreeNode(70);
		TreeNode node80 = new TreeNode(80);
		TreeNode node90 = new TreeNode(90);
		TreeNode node11 = new TreeNode(11);
		TreeNode node21 = new TreeNode(21);
		TreeNode node211 = new TreeNode(211);
		TreeNode node202 = new TreeNode(202);

		root.left = node211;
		root.right = node202;
		node211.left = node20;
		node20.left = node30;
		node20.right = node40;
		node30.right = node50;
		node202.left = node60;
		node60.right = node70;
		node70.left = node80;
		node60.left = node21;
		node21.left = node90;
		node90.left = node11;

		return root;
	}

}
