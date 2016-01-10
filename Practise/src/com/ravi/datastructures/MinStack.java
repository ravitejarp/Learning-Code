package com.ravi.datastructures;

public class MinStack {
	Stack<Integer> stac = new Stack<>();
	Stack<Integer> minStac = new Stack<>();

	public void push(Integer data) {
		stac.push(data);
		if (minStac.isEmpty()) {
			minStac.push(data);
		} else {
			if (minStac.peek() > data) {
				minStac.push(data);
			} else {
				minStac.push(minStac.peek());
			}

		}
	}

	public Integer pop() throws StackEmptyException {
		minStac.pop();
		return stac.pop();
	}

	public int minElement() {
		return minStac.peek();
	}

	public static void main(String[] args) {

	}
}
