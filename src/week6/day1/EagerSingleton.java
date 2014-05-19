package week6.day1;

public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
	
}
