package com.ravi.learn;

public class LinkedList {
	private Link head;

	public void insert(int data) {
		Link next = new Link(data, null);
		if (head != null) {
			next.next = head;
			head = next;
		} else {
			next.next = null;
			head = next;
		}
	}

	public void display() {
		Link temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
			if (temp != null) {
				System.out.print("-->");
			} else {
				System.out.println();
			}

		}
	}

	public void delete() {
		System.out.println("Deleted:" + head.data);
		head = head.next;
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert(20);
		l.insert(0);
		l.insert(120);
		l.insert(230);
		l.insert(203);
		l.insert(20134);
		l.insert(20334);

		l.insert(1220);
		l.insert(210);

		l.display();

		l.delete();
		l.display();

	}
}
