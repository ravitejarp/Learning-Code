package com.ravi.datastructures.trees.problems;

import com.ravi.datastructures.trees.BSTTreeNode;

public class Mirror {
    public static void main(String[] args) {
        BSTTreeNode<Integer> one = new BSTTreeNode<>(1);
        BSTTreeNode<Integer> two = new BSTTreeNode<>(2);
        BSTTreeNode<Integer> three = new BSTTreeNode<>(3);
        BSTTreeNode<Integer> four = new BSTTreeNode<>(4);
        BSTTreeNode<Integer> five = new BSTTreeNode<>(5);
        BSTTreeNode<Integer> six = new BSTTreeNode<>(6);
        BSTTreeNode<Integer> seven = new BSTTreeNode<>(7);
        BSTTreeNode<Integer> eight = new BSTTreeNode<>(8);

        one.setLeftTree(two);
        one.setRightTree(three);

        three.setLeftTree(seven);
        three.setRightTree(six);

        seven.setLeftTree(eight);


        six.setLeftTree(five);
        six.setRightTree(four);

        printTree(one);
        mirrorTree(one);
        printTree(one);
    }

    private static <T> void mirrorTree(BSTTreeNode<T> root) {
        if (root == null) {
            return;
        }
        BSTTreeNode<T> leftTree = root.getLeftTree();
        root.setLeftTree(root.getRightTree());
        root.setRightTree(leftTree);
        mirrorTree(root.getLeftTree());
        mirrorTree(root.getRightTree());

    }


    private static <T> void printTree(BSTTreeNode<T> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData() + "->" + root.getLeftTree());
        System.out.println(root.getData() + "->" + root.getRightTree());
        printTree(root.getLeftTree());
        printTree(root.getRightTree());
    }

}
