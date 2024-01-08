package com.ravi.datastructures.trees.problems;

import com.ravi.datastructures.trees.BSTTreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SummingNodesAlongPath {
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


        sumOfNodesR(one, 14, 0, "");
    }

    private static <T> void sumOfNodesR(BSTTreeNode<T> root, int sum, int currSum, String path) {
        if (root == null) {
            return;
        }
        int currValue = Integer.parseInt(String.valueOf(root.getData()));
        if (root.getLeftTree() == null && root.getRightTree() == null) {
            if (sum == (currSum + currValue)) {
                System.out.println("Path found:" + path + "->" + root.getData());
            }
            return;
        }
        if (root.getLeftTree() != null) {
            sumOfNodesR(root.getLeftTree(), sum, currSum + currValue, path + "->" + root.getData());
        }

        if (root.getRightTree() != null) {
            sumOfNodesR(root.getRightTree(), sum, currSum + currValue, path + "->" + root.getData());
        }

    }

}
