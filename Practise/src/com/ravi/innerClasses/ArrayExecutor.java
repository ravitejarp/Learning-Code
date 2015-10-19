package com.ravi.innerClasses;

public class ArrayExecutor {
	static int search = 56;
	static int searchAnother = 6;
	static int delete = 53;
	static int deleteAnother = 55;

	public static void main(String[] args) {
		ArrayCreatorClass acc = new ArrayCreatorClass(15);
		acc.setElem(0, 54);
		acc.setElem(1, 55);
		acc.setElem(2, 56);
		acc.setElem(3, 57);
		acc.setElem(4, 58);
		acc.setElem(5, 59);
		acc.setElem(6, 50);
		acc.setElem(7, 51);
		acc.setElem(8, 52);
		acc.setElem(9, 53);

		displayElements(acc);
		// To search for a given element

		search(acc, search);
		search(acc, searchAnother);

		deleteAndPrint(acc, delete);
		deleteAndPrint(acc, deleteAnother);
	}

	private static void search(ArrayCreatorClass acc, int searchValue) {
		boolean found = false;
		for (int i = 0; i < 15; i++) {
			if (searchValue == acc.getElem(i)) {
				found = true;
				System.out.println("Search text found and is at location:"
						+ (i + 1));
				break;
			}
		}
		if (!found)
			System.out.println("Search failed no match found for:"
					+ searchValue);
	}

	private static void displayElements(ArrayCreatorClass acc) {
		// To display elements
		for (int i = 0; i < 15; i++)
			System.out.print(acc.getElem(i) + "\t");

		System.out.println("\n");
	}

	private static void deleteAndPrint(ArrayCreatorClass acc, int toDelete) {
		int index;
		// To delete an element
		for (index = 0; index < 15; index++) {
			if (toDelete == acc.getElem(index)) {
				break;

			}
		}

		for (int j = index; j < 15; j++) {
			if (j == 14) {
				acc.setElem(j, 0);
			} else {
				acc.setElem(j, acc.getElem(j + 1));
			}
		}

		System.out.println("Elements after deletion");
		displayElements(acc);
	}

}
