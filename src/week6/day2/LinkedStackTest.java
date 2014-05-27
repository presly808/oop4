package week6.day2;

public class LinkedStackTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		LinkedStack<String> stack = new LinkedStack<>();
		stack.push("New");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		stack.push("7");
		
		LinkedStack<String> stack1 = (LinkedStack<String>) stack.clone(); 
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
