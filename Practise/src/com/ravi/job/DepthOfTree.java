package com.ravi.job;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class DepthOfTree {

	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	static List<Integer> list = new ArrayList<Integer>();
	static List<Integer> listOfWidth = new ArrayList<Integer>();
	static int count = 0;

	public void traversal(TreeNode root, int[] arr, int len) {
		if (root == null) {
			return;
		}

		arr[len] = root.data;
		len++;

		if (root.left == null && root.right == null) {
			list.add(root.data);
			listOfWidth.add(len);
			

		} else {
			traversal(root.left, arr, len);

			traversal(root.right, arr, len);
		}

	}

	public static void main(String[] args) {
		DepthOfTree dot = new DepthOfTree();
		TreeNode root = dot.retrnRoot();
		dot.traversal(root, new int[50], 0);
		for (int i : list) {
			System.out.println(i);
		}
		System.out.println("Width");
		for (int is : listOfWidth) {
			System.out.println(is);
		}
	}

	public TreeNode retrnRoot() {
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
