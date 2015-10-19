package com.ravi.learnings;

public class ArrayDemo {

	ArrayDemoData data = new ArrayDemoData(new int[100], 0, 0);

	public void insertInto(int value) {
		data.arr[data.index++] = value;
		data.numberOfElements++;
	}

	public int getTheValue(int ind) {
		if (ind > data.index)
			return 0;
		else
			return data.arr[ind];
	}

	public int search(int value) {
		int indexOf = 101;
		for (int i = 0; i < data.numberOfElements; i++) {
			if (data.arr[i] == value) {
				indexOf = i;
				System.out.println(value + " is found at index " + i);
				break;
			}
		}
		return indexOf;
	}

	public void display() {
		for (int i = 0; i < data.numberOfElements; i++) {
			System.out.println(data.arr[i]);
		}
	}

	public void delete(int value) {
		int search = search(value);
		if (search != 101) {
			for (int i = search; i < data.numberOfElements; i++) {
				data.arr[i] = data.arr[i + 1];
			}
			data.numberOfElements--;
		} else {
			System.out.println("Value not found");
		}

	}

	public static void main(String[] args) {
		ArrayDemo arrd = new ArrayDemo();
		arrd.insertInto(55);
		arrd.insertInto(5);
		arrd.insertInto(847);
		arrd.insertInto(985);
		arrd.insertInto(12);
		arrd.insertInto(659);
		arrd.insertInto(5552);
		arrd.insertInto(9451);
		arrd.insertInto(5551);
		arrd.insertInto(59874);
		arrd.insertInto(953);
		arrd.insertInto(512);

		arrd.display();

		int search = arrd.search(548);
		if (search == 101)
			System.out.println("Search failed and value not found");

		search = arrd.search(659);
		if (search == 101)
			System.out.println("Search failed and value not found");

		arrd.delete(512);
		arrd.display();

	}

}
