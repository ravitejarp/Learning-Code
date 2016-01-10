package com.ravi.datastructures;

public class LinkedList<T> {
	Node<T> head;

	public LinkedList() {
		head = new Node<T>();
	}

	public T remove(T data) {
		/**
		 * Node<T> temp = head; Node<T> temp1 = temp; while (temp.data != data)
		 * { if (temp.next == null) { return null; } else { temp1 = temp; temp =
		 * temp.next; } } if (temp == head) { head = head.next;
		 * 
		 * } else { temp1.next = temp.next; }
		 * 
		 * return temp.data;
		 */

		Node<T> temp = head;
		Node<T> temp1 = temp;
		while (temp != null) {
			if (temp.getData() == data) {
				temp1.setNext(temp.getNext());
				return temp.getData();
			}
			temp1 = temp;
			temp = temp.getNext();
		}
		return null;
	}

	public T remove() {
		if (!isEmpty()) {
			T data = head.getData();
			head = head.getNext();
			return data;
		}
		return null;
	}

	public T getHeadData() {
		if (!isEmpty()) {
			return head.getData();
		}
		return null;
	}

	public void insert(T data) {
		Node<T> temp1 = new Node<T>();
		temp1.setData(data);
		temp1.setNext(head);
		head = temp1;

	}

	public void printList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "\t");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void sortedList() {

	}

	public boolean isEmpty() {
		return head == null ? true : false;
	}

	public int getSize() {
		Node<T> temp = head;
		int counter = 0;
		while (temp != null) {
			counter++;
			temp = temp.getNext();
		}
		return counter;
	}
}
