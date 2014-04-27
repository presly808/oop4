package week4.day1.abstract_c;

public abstract class AEmployee {
	
	private int age;
	private String name;
	
	public AEmployee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void showInfo();
	
}
