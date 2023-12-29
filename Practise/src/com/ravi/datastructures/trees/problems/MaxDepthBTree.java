package com.ravi.datastructures.trees.problems;

import com.ravi.datastructures.trees.BSTTreeNode;

public class MaxDepthBTree {
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

        System.out.println(maxDepth(a));
    }

    public static <T> int maxDepth(BSTTreeNode<T> root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeftTree() == null && root.getRightTree() == null) {
            return 0;
        }
        int lCount = maxDepth(root.getLeftTree());
        int rCount = maxDepth(root.getRightTree());

        int maxDepth = Math.max(lCount, rCount) + 1;
        System.out.print("Current Node:" + root.getData());
        System.out.print(", Current left Max Depth:" + lCount);
        System.out.print(", Current right Max Depth:" + rCount);
        System.out.println(", Current Max Depth:" + maxDepth);
        return maxDepth;
    }
}
