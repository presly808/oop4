package week2.day2;

public class TestNumber {

	public static void main(String[] args) {
		Number n1 = new Number(34);
		Number n2 = new Number(12);
		
		
		Number res = n1.add(n2);
		
		System.out.println(res.toInt());

	}

}
