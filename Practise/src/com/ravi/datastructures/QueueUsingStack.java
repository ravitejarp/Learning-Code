package com.ravi.datastructures;

public class QueueUsingStack {

	Stack<String> forwardStack = new Stack<String>();
	Stack<String> reverseStack = new Stack<String>();

	public void enQueue(String data) throws StackEmptyException {
		if (forwardStack.isEmpty() && reverseStack.isEmpty()) {
			forwardStack.push(data);
		} else {
			if (!forwardStack.isEmpty()) {
				forwardStack.push(data);
			} else {
				while (!reverseStack.isEmpty()) {
					forwardStack.push(reverseStack.pop());
				}
			}
		}
	}

	public String deQueue() throws StackEmptyException, QueueFullException {
		if (forwardStack.isEmpty() && reverseStack.isEmpty()) {
			throw new QueueFullException("Queue is empty");
		} else {
			if (!reverseStack.isEmpty()) {
				return reverseStack.pop();
			} else {
				while (!forwardStack.isEmpty()) {
					reverseStack.push(forwardStack.pop());
				}
				return reverseStack.pop();
			}
		}
	}

	public void prinTheElements() {
		if (!forwardStack.isEmpty()) {
			forwardStack.printData();
		} else {
			reverseStack.printData();
		}
	}

	public static void main(String[] args) throws StackEmptyException,
			QueueFullException {
		QueueUsingStack q = new QueueUsingStack();
		q.enQueue("Ravi");
		q.enQueue("Teja");
		q.enQueue("Ravuri");
		q.enQueue("Pavan");
		q.enQueue("Sri");
		q.prinTheElements();
		System.out.println(q.deQueue());
		q.prinTheElements();
		System.out.println(q.deQueue());
		q.prinTheElements();
	}
}
