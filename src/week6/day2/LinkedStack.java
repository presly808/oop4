package week6.day2;

import java.util.Iterator;

import week5.day2.ex.IStack;

public class LinkedStack<T> implements IStack<T>, Iterable<T>{

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
	
	
	
	
	@Override
	public Iterator<T> iterator() {
		return new LinkedStackIterator();
	}




	private class LinkedStackIterator implements Iterator<T>{
		
		private Node iterTop = top;

		@Override
		public boolean hasNext() {
			return iterTop != null;
		}

		@Override
		public T next() {
			Node temp = iterTop;
			iterTop = iterTop.next;
			return temp.value;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}
	
}
