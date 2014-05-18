package week5.day2.ex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Some","New","23");
		
		Iterator<String> listIter = list.iterator();
		
		while(listIter.hasNext()){
			System.out.println(listIter.next());
		}
		
		for(String s : list){
			System.out.println(s);
		}
		
		
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		Iterator<Integer> stackIter = stack.iterator();
		
		while(stackIter.hasNext()){
			System.out.println(stackIter.next());
		}
		

	}

}
