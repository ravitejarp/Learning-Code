package com.ravi.datastructures.trees.dfs;

import com.ravi.datastructures.trees.BSTTreeNode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFTraversalUsingStack {

    public static void main(String[] args) {
        BSTTreeNode<Character> a = new BSTTreeNode<>('a');
        BSTTreeNode<Character> b = new BSTTreeNode<>('b');
        BSTTreeNode<Character> c = new BSTTreeNode<>('c');
        BSTTreeNode<Character> d = new BSTTreeNode<>('d');
        BSTTreeNode<Character> e = new BSTTreeNode<>('e');
        BSTTreeNode<Character> f = new BSTTreeNode<>('f');
        BSTTreeNode<Character> g = new BSTTreeNode<>('g');
        BSTTreeNode<Character> h = new BSTTreeNode<>('h');

        a.setLeftTree(b);
        a.setRightTree(c);

        c.setLeftTree(d);
        c.setRightTree(e);

        d.setLeftTree(f);
        d.setRightTree(h);

        e.setLeftTree(g);

        printInOrder(a);
        System.out.println();
        preOrder(a);
        System.out.println();
        postOrder(a);


    }

    public static <T> void printInOrder(BSTTreeNode<T> root) {
        if (root == null) {
            return;
        }
        Set<BSTTreeNode> visitedNode = new HashSet<>();
        Stack<BSTTreeNode<T>> stack = new java.util.Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            BSTTreeNode<T> pop = stack.pop();
            if (pop.getLeftTree() == null && pop.getRightTree() == null) {
                System.out.print(pop + "->");
            } else if (visitedNode.contains(pop)) {
                System.out.print(pop + "->");
            } else {
                visitedNode.add(pop);
                if (root.getRightTree() != null) {
                    printInOrder(root.getRightTree());
                }
                if (root.getLeftTree() != null) {
                    printInOrder(root.getLeftTree());
                }

            }
        }
    }

    public static <T> void preOrder(BSTTreeNode<T> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData() + "->");
        if (root.getLeftTree() != null) {
            printInOrder(root.getLeftTree());
        }
        if (root.getRightTree() != null) {
            printInOrder(root.getRightTree());
        }
    }

    public static <T> void postOrder(BSTTreeNode<T> root) {
        if (root == null) {
            return;
        }
        if (root.getLeftTree() != null) {
            printInOrder(root.getLeftTree());
        }
        if (root.getRightTree() != null) {
            printInOrder(root.getRightTree());
        }
        System.out.println(root.getData() + "->");
    }
}
