package com.rohit;

public class Node<T> {
	protected T data;
	protected Node<T> next;
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}
}
