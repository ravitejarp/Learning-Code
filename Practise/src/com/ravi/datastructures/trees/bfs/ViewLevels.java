package com.ravi.datastructures.trees.bfs;

import com.ravi.datastructures.trees.BSTTreeNode;
import com.ravi.datastructures.trees.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class ViewLevels {
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
        int level = 0;
        Queue<Pair<BSTTreeNode<T>, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, level));

        while (!queue.isEmpty()) {
            Pair<BSTTreeNode<T>, Integer> pair = queue.remove();
            System.out.print(pair + "->");
            level = pair.getValue() + 1;
            if (pair.getKey().getLeftTree() != null) {
                queue.add(new Pair<>(pair.getKey().getLeftTree(), level));
            }
            if (pair.getKey().getRightTree() != null) {
                queue.add(new Pair<>(pair.getKey().getRightTree(), level));
            }
        }
        System.out.println("null");
    }
}
