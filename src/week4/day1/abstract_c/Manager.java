package week4.day1.abstract_c;

public class Manager extends AEmployee {

	public Manager(int age, String name) {
		super(age, name);
	}

	@Override
	public void showInfo() {
		System.out.println("Im director");
	}
	
	
}
