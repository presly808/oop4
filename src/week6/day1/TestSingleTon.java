package week6.day1;

public class TestSingleTon {
	public static void main(String[] args) {
	LazySingleton instanse = LazySingleton.getInstance();
	
	LazySingleton sec = LazySingleton.getInstance();
	}
}
