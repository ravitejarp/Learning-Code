package com.ravi.datastructures.trees.dfs;

import com.ravi.datastructures.trees.BSTTreeNode;

public class DFTraversal {

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
        if (root.getLeftTree() != null) {
            printInOrder(root.getLeftTree());
        }
        System.out.print(root.getData() + "->");
        if (root.getRightTree() != null) {
            printInOrder(root.getRightTree());
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
