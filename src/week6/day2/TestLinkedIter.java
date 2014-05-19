package week6.day2;

import java.util.Stack;

public class TestLinkedIter {

	public static void main(String[] args) {
		
		
		LinkedStack<Integer> stack = new LinkedStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.iterator();
		
		for(Integer i : stack){
			System.out.println(i);
		}
	}

}
