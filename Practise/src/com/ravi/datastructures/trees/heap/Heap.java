package com.ravi.datastructures.trees.heap;

import java.lang.reflect.Array;

public abstract class Heap<T extends Comparable> {

    T[] array;
    int count = 0;
    private static final int MAX_SIZE = 50;

    public Heap(Class<T> clazz) {
        this(clazz, MAX_SIZE);
    }

    public Heap(Class<T> tClass, int size) {
        array = (T[]) Array.newInstance(tClass, size);
    }

    public int getLeftChild(int index) {
        int leftChildIndex = 2 * index + 1;
        if (leftChildIndex >= count) {
            return -1;
        }
        return leftChildIndex;
    }

    public int getRightChild(int index) {
        int rightChildIndex = 2 * index + 2;
        if (rightChildIndex >= count) {
            return -1;
        }
        return rightChildIndex;
    }

    public int getParentIndex(int index) {
        if (index == 0 || index > count) {
            return -1;
        }
        return (index - 1) / 2;
    }

    public void swap(int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public int getCount() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == MAX_SIZE;
    }

    public T getElementAtIndex(int index) {
        return array[index];
    }
}
