package week6.day1;

public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {
		System.out.println("in constructor");
	}

	public static LazySingleton getInstance() {

		if (instance == null) {   
			instance = new LazySingleton();
		}
		return instance;
	}

}
