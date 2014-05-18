package week6.day2;

import week5.day2.ex.IStack;

public class LinkedStack<T> implements IStack<T>{

	private Node top;
	
	private class Node {
		T value;
		Node next;
		
		public Node(T value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}
		
	}
	
	@Override
	public void push(T o) {
		if(top == null){
			top = new Node(o, null);
		} else {
			Node newNode = new Node(o, top);
			top = newNode; 
		}
		
	}

	@Override
	public T pop() {
		if(top == null){
			throw new RuntimeException("Stack empty");
		}
		Node temp = top;
		top = top.next;
		return temp.value;
	}
	
	

}
