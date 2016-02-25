package com.ravi.datastructures;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Tree {

	public void breadthFirst(TreeNodeCA<Integer> root) {

		if (root == null) {
			return;
		}
		Queue<TreeNodeCA<Integer>> q = new LinkedList<TreeNodeCA<Integer>>();
		do {
			if (q.isEmpty()) {
				q.add(root);
			} else {
				TreeNodeCA<Integer> remove = q.remove();
				System.out.println(remove.getData());
				if (remove.getLeft() != null)
					q.add(remove.getLeft());
				if (remove.getRight() != null)
					q.add(remove.getRight());
			}
		} while (!q.isEmpty());
	}

	public void depthFirst(TreeNodeCA<Integer> root) {
		if (root == null)
			return;
		Stack<TreeNodeCA<Integer>> s = new Stack<>();
		do {
			if (s.isEmpty()) {
				System.out.println(root.getData());
				s.push(root);
			} else if (s.peek().getLeft() != null) {
				System.out.println(s.peek().getLeft().getData());
				s.push(s.peek().getLeft());
			}
		} while (!s.isEmpty());
	}

	public static void main(String[] args) {
		TreeNodeCA<Integer> node = new TreeNodeCA<>();
		node.setData(25);
		TreeNodeCA<Integer> node1 = new TreeNodeCA<>();
		node1.setData(26);
		node.setLeft(node1);
		TreeNodeCA<Integer> node2 = new TreeNodeCA<>();
		node2.setData(27);
		node.setRight(node2);
		TreeNodeCA<Integer> node3 = new TreeNodeCA<>();
		node3.setData(28);
		node1.setLeft(node3);
		TreeNodeCA<Integer> node4 = new TreeNodeCA<>();
		node4.setData(29);
		node1.setRight(node4);
		TreeNodeCA<Integer> node5 = new TreeNodeCA<>();
		node5.setData(30);
		node2.setLeft(node5);
		TreeNodeCA<Integer> node6 = new TreeNodeCA<>();
		node6.setData(31);
		node3.setLeft(node6);
		TreeNodeCA<Integer> node7 = new TreeNodeCA<>();
		node7.setData(32);
		node4.setLeft(node7);
		TreeNodeCA<Integer> node8 = new TreeNodeCA<>();
		node8.setData(33);
		node4.setRight(node8);
		TreeNodeCA<Integer> node9 = new TreeNodeCA<>();
		node9.setData(34);
		node5.setLeft(node9);

		System.out.println("Calling");
		Tree t = new Tree();
		t.breadthFirst(node);
		System.out.println("Call Completed");
	}
}
