package com.ravi.datastructures.trees.bfs;

import com.ravi.datastructures.trees.BSTTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
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

        printBFS(a);


    }

    private static <T> void printBFS(BSTTreeNode<T> root) {
        if (root == null) {
            return;
        }
        Queue<BSTTreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BSTTreeNode<T> remove = queue.remove();
            System.out.print(remove.getData() + "->");
            if (remove.getLeftTree() != null) {
                queue.add(remove.getLeftTree());
            }
            if (remove.getRightTree() != null) {
                queue.add(remove.getRightTree());
            }
        }
        System.out.println("null");
    }
}
