package com.ravi.datastructures;

public class Element<T> {
	private T data;
	private Element<T> next;

	public Element() {
		next = null;
		data = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Element<T> getNext() {
		return next;
	}

	public void setNext(Element<T> Next) {
		this.next = Next;
	}

}
