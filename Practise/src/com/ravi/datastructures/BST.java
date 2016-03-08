package com.ravi.datastructures;

import com.ravi.learn.sortAlgo.BS;

public class BST<T> {
	public TreeNode<T> insert(TreeNode<T> node, TreeNode<T> root) {
		TreeNode<T> temp = root;
		if (root == null) {
			root = node;
			System.out.println(node.data);
			return root;
		} else {
			while (temp != null) {
				if (((Comparable<T>) node.data).compareTo(temp.data) < 0) {
					if (temp.getLeft() != null) {
						if (((Comparable<T>) node.data).compareTo(temp
								.getLeft().data) < 0) {

							temp = temp.getLeft();
						} else {
							if (temp.getLeft().getRight() == null) {
								node.setRight(temp.getLeft().getRight());
								temp.getLeft().setRight(node);
								break;
							}
							temp = temp.getLeft().getRight();
						}
					} else {
						node.setLeft(temp.getLeft());
						temp.setLeft(node);
						break;
					}
				} else if (((Comparable<T>) node.data).compareTo(temp.data) > 0) {
					if (temp.getRight() != null) {
						if (((Comparable<T>) node.data).compareTo(temp
								.getRight().data) > 0)
							temp = temp.getRight();
						else {
							if (temp.getRight().getLeft() == null) {
								node.setLeft(temp.getRight().getLeft());
								temp.getRight().setLeft(node);
								break;
							}
							temp = temp.getRight().getLeft();
						}
					} else {
						node.setRight(temp.getRight());
						temp.setRight(node);
						break;
					}

				} else {
					if (((Comparable<T>) node.data).compareTo(temp.data) > 0
							&& ((Comparable<T>) node.data).compareTo(temp
									.getLeft().data) > 0) {
						node.setLeft(temp.getLeft());
						temp.setLeft(node);
						break;
					} else if (((Comparable<T>) node.data).compareTo(temp.data) > 0
							&& ((Comparable<T>) node.data).compareTo(temp
									.getRight().data) < 0) {
						node.setRight(temp.getRight());
						temp.setRight(node);
						break;
					}
				}
			}
		}
		System.out.println("Inserted:" + node.data);
		return root;
	}

	public TreeNode<T> recursiveInsertion(TreeNode<T> node, TreeNode<T> head) {
		if (head == null)
			return node;

		if (((Comparable<T>) (node.data)).compareTo(head.data) < 0)
			head.setLeft(recursiveInsertion(node, head.getLeft()));
		else
			head.setRight(recursiveInsertion(node, head.getRight()));

		return head;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(10);
		TreeNode<Integer> root1 = new TreeNode<Integer>(10);
		TreeNode<Integer> node = new TreeNode<Integer>(2);
		TreeNode<Integer> node1 = new TreeNode<Integer>(5);
		TreeNode<Integer> node2 = new TreeNode<Integer>(12);
		TreeNode<Integer> node3 = new TreeNode<Integer>(21);
		TreeNode<Integer> node4 = new TreeNode<Integer>(7);
		TreeNode<Integer> node5 = new TreeNode<Integer>(51);
		TreeNode<Integer> node6 = new TreeNode<Integer>(11);

		BST<Integer> bs = new BST<>();
		root = bs.insert(root, null);
		root = bs.insert(node, root);
		root = bs.insert(node1, root);
		root = bs.insert(node2, root);
		root = bs.insert(node3, root);

		root = bs.insert(node4, root);
		root = bs.insert(node5, root);
		root = bs.insert(node6, root);

		DFS<Integer> d = new DFS<>();
		System.out.println("--------------");
		d.dfSearch(root);

		System.out.println("--------------");
		root1 = bs.recursiveInsertion(root1, null);
		root1 = bs.recursiveInsertion(node, root1);
		root1 = bs.recursiveInsertion(node1, root1);
		root1 = bs.recursiveInsertion(node2, root1);
		root1 = bs.recursiveInsertion(node3, root1);

		root1 = bs.recursiveInsertion(node4, root1);
		root1 = bs.recursiveInsertion(node5, root1);
		root1 = bs.recursiveInsertion(node6, root1);
		DFS<Integer> d1 = new DFS<>();
		System.out.println("--------------");
		d.dfSearch(root1);
	}
}
