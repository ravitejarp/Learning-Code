package com.ravi.datastructures.trees;

public class BSTTreeNode<T> {
    private T data;
    private BSTTreeNode<T> leftTree;
    private BSTTreeNode<T> rightTree;

    public BSTTreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BSTTreeNode<T> getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(BSTTreeNode<T> leftTree) {
        this.leftTree = leftTree;
    }

    public BSTTreeNode<T> getRightTree() {
        return rightTree;
    }

    public void setRightTree(BSTTreeNode<T> rightTree) {
        this.rightTree = rightTree;
    }

    @Override
    public String toString() {
        return this.getData().toString();
    }
}
