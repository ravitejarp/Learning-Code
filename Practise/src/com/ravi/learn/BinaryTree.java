package com.ravi.learn;

public class BinaryTree extends BT {

	public static void main(String[] args) {
		BT root = new BT();
		BT levlef = new BT();
		BT lvergh = new BT();
		BT lvel12l = new BT();
		BT leaf = new BT();

		root.data = 10;
		root.left = levlef;
		levlef.data = 20;
		root.right = lvergh;
		lvergh.data = 30;
		levlef.left = lvel12l;
		lvel12l.data = 40;
		lvel12l.right = leaf;
		leaf.data = 50;

	}

}
