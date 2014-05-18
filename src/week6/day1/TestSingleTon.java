package week6.day1;

public class TestSingleTon {
	public static void main(String[] args) {
	SingleTon instanse = SingleTon.getInstance();
	
	SingleTon sec = SingleTon.getInstance();
	}
}
