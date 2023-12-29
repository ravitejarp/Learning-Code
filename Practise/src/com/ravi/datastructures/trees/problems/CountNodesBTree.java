package com.ravi.datastructures.trees.problems;

import com.ravi.datastructures.trees.BSTTreeNode;

public class CountNodesBTree {


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

        System.out.println(countNodes(a));
        System.out.println(countNodes(null));
    }

    public static <T> int countNodes(BSTTreeNode<T> root) {
        if (root == null) {
            return 0;
        }
        int rcount = countNodes(root.getRightTree());
        int lcount = countNodes(root.getLeftTree());
        return 1 + rcount + lcount;
    }
}
