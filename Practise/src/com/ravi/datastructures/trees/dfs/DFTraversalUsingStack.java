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

        printInOrder(a);
        System.out.println();
        preOrder(a);
        System.out.println();
        postOrder(a);
        System.out.println();

        c.setLeftTree(d);
        c.setRightTree(e);

        printInOrder(a);
        System.out.println();
        preOrder(a);
        System.out.println();
        postOrder(a);
        System.out.println();

        d.setLeftTree(f);
        d.setRightTree(h);

        printInOrder(a);
        System.out.println();
        preOrder(a);
        System.out.println();
        postOrder(a);
        System.out.println();

        e.setLeftTree(g);

        printInOrder(a);
        System.out.println();
        preOrder(a);
        System.out.println();
        postOrder(a);


    }

    public static <T> void printInOrder(BSTTreeNode<T> root) {
        System.out.println("+++++IN Order+++++++");
        if (root == null) {
            return;
        }
        Set<BSTTreeNode<T>> visitedNode = new HashSet<>();
        Stack<BSTTreeNode<T>> stack = new java.util.Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            BSTTreeNode<T> top = stack.pop();
            if (top.getLeftTree() == null && top.getRightTree() == null) {
                System.out.print(top + "->");
            } else if (visitedNode.contains(top)) {
                System.out.print(top + "->");
            } else {
                visitedNode.add(top);
                if (top.getRightTree() != null) {
                    stack.push(top.getRightTree());
                }
                stack.push(top);
                if (top.getLeftTree() != null) {
                    stack.push(top.getLeftTree());
                }

            }
        }
    }

    public static <T> void preOrder(BSTTreeNode<T> root) {
        System.out.println("+++++Pre Order+++++++");
        if (root == null) {
            return;
        }
        Set<BSTTreeNode<T>> visitedNode = new HashSet<>();
        Stack<BSTTreeNode<T>> stack = new java.util.Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            BSTTreeNode<T> top = stack.pop();
            if (top.getLeftTree() == null && top.getRightTree() == null) {
                System.out.print(top + "->");
            } else if (visitedNode.contains(top)) {
                System.out.print(top + "->");
            } else {
                visitedNode.add(top);
                if (top.getRightTree() != null) {
                    stack.push(top.getRightTree());
                }
                if (top.getLeftTree() != null) {
                    stack.push(top.getLeftTree());
                }
                stack.push(top);

            }
        }
    }

    public static <T> void postOrder(BSTTreeNode<T> root) {
        System.out.println("+++++Post Order+++++++");
        if (root == null) {
            return;
        }
        Set<BSTTreeNode<T>> visitedNode = new HashSet<>();
        Stack<BSTTreeNode<T>> stack = new java.util.Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            BSTTreeNode<T> top = stack.pop();
            if (top.getLeftTree() == null && top.getRightTree() == null) {
                System.out.print(top + "->");
            } else if (visitedNode.contains(top)) {
                System.out.print(top + "->");
            } else {
                visitedNode.add(top);
                stack.push(top);
                if (top.getRightTree() != null) {
                    stack.push(top.getRightTree());
                }
                if (top.getLeftTree() != null) {
                    stack.push(top.getLeftTree());
                }

            }
        }
    }
}
