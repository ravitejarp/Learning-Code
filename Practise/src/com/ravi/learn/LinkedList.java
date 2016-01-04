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

	public int deleteSpecific(int toDelete) {
		Link temp = head;
		if (temp.data == toDelete) {
			head = temp.next;
			return temp.data;
		}
		while (temp.next != null) {
			if (temp.next.data == toDelete) {
				System.out.println("Deleted:" + temp.next.data);
				int data = temp.next.data;
				temp.next = temp.next.next;
				return data;
			}
			temp = temp.next;
		}
		return -1;
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
		System.out.println(l.deleteSpecific(11111));
		l.display();
		System.out.println(l.deleteSpecific(1220));
		l.display();

	}
}
