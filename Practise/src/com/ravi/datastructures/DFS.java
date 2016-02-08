package com.ravi.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS<T> {
	public void dfSearch(TreeNode<T> node) {
		Stack<TreeNode<T>> s = new Stack<>();
		List<TreeNode<T>> pop = new ArrayList<>();
		do {
			if (s.isEmpty()) {
				s.push(node);
			}
			if (s.peek().getLeft() == null && s.peek().getRight() == null) {
				TreeNode<T> pop2 = s.pop();
				pop.add(pop2);
				System.out.println(pop2.data);
			} else {
				if (s.peek().getLeft() != null
						&& !pop.contains(s.peek().getLeft()))
					s.push(s.peek().getLeft());
				else if (s.peek().getRight() != null
						&& !pop.contains(s.peek().getRight()))
					s.push(s.peek().getRight());
				else {
					TreeNode<T> pop2 = s.pop();
					pop.add(pop2);
					System.out.println(pop2.data);
				}

			}

		} while (!s.isEmpty());
	}

	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<String>("A");
		TreeNode<String> node = new TreeNode<String>("B");
		TreeNode<String> node1 = new TreeNode<String>("C");
		TreeNode<String> node2 = new TreeNode<String>("D");
		TreeNode<String> node3 = new TreeNode<String>("E");
		TreeNode<String> node4 = new TreeNode<String>("F");
		TreeNode<String> node5 = new TreeNode<String>("G");
		TreeNode<String> node6 = new TreeNode<String>("H");

		root.setLeft(node);
		root.setRight(node3);
		node.setLeft(node1);
		node.setRight(node2);
		node3.setLeft(node4);
		node3.setRight(node5);
		node5.setLeft(node6);
		DFS<String> d = new DFS<>();
		d.dfSearch(root);

	}
}
