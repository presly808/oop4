package week5.day2.ex;

import java.util.Arrays;

public class MyStack implements IStack {

	private int index;
	private Object[] mas = new Object[10];
	
	public MyStack() {
		super();
	}

	public MyStack(int size){
		mas = new Object[size];
	}
	
	@Override
	public void push(Object o) {
		if(index == mas.length){
			throw new RuntimeException("Stack is Full");
		}
		mas[index++] = o;
	}

	@Override
	public Object pop() {
		if(index - 1 == 0){
			throw new RuntimeException("Stack is empty");
		}
		
		Object temp = mas[--index];// index = index - 1;
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

	
	
}
