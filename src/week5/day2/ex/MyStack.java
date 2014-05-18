package week5.day2.ex;

import java.util.Arrays;
import java.util.Iterator;

public class MyStack<T> implements IStack<T>, Iterable<T> {

	private int index;
	private T[] mas = (T[]) new Object[10];
	
	public MyStack() {
		super();
	}

	public MyStack(int size){
		mas = (T[]) new Object[size];
	}
	
	@Override
	public void push(T o) {
		if(index == mas.length){
			throw new RuntimeException("Stack is Full");
		}
		mas[index++] = o;
	}

	@Override
	public T pop() {
		if(index - 1 == 0){
			throw new RuntimeException("Stack is empty");
		}
		
		T temp = mas[--index];// index = index - 1;
		mas[index] = null;
		
		return temp;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = index - 1; i >= 0; i--){
			sb.append(mas[i].toString() + "\n");
		}
		return sb.toString();
	}

	private class StackIterator implements Iterator<T> {

		private int iterIndex = index - 1;
		
		@Override
		public boolean hasNext() {
			return iterIndex >= 0;
		}

		@Override
		public T next() {
			return mas[iterIndex--];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}

	@Override
	public Iterator<T> iterator() {
		return new StackIterator();
	}
	
	
	
}
