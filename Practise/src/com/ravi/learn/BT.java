package com.ravi.learn;

public class BT {
	protected Object left;
	protected Object right;
	protected int data;

	BT() {
		left = null;
		right = null;
		data = 0;

	}

	public void deleteNode(BT rootNode, int nodeToDelete) {
		while (rootNode.left != null && rootNode.right != null) {
			if(rootNode.data==nodeToDelete)
			{
				
			}
			else
			{
			}
		}
	}
}
