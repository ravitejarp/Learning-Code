package com.ravi.datastructures;

public class LinkedList<T> {
	Node<T> head;

	public LinkedList(T data) {
		head = new Node<T>();
		head.data = data;
	}

	public T remove(T data) {
		Node<T> temp = head;
		Node<T> temp1 = head;
		while (temp != null) {
			if (temp.data == data) {
				temp1.next = temp;
				head = temp1;
				return temp.data;
			}
			temp1 = temp;
			temp = temp.next;
		}
		return null;
	}

	public void insert(T data) {
		Node<T> temp1 = new Node<T>();
		temp1.data = data;
		temp1.next=head;
		head = temp1;

	}

	public void printList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}
}
