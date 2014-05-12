package week5.day2.ex;

public class TestMyStack {
	
	public static void main(String[] args) {
		
		MyStack ms = new MyStack(20);
		
		ms.push("One");
		ms.push("Two");
		ms.push("Three");
		ms.push("Four");
		
		ms.pop();
		
		System.out.println(ms.toString());
		
		
	}
}
