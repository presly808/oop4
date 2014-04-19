package week3.day1;

public class Tester extends Employee {

	private String type;
	
	public Tester(){
		
	}
	
	public Tester(String type){
		super();
		this.type = type;
	}
	
	public Tester(String name, int age, double salary, String type){
		super(name, age, salary);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void go(){
		
	}
	
	public void printInfo(){
		System.out.println("Tester. Type = " + type);
		super.printInfo();
		System.out.println("name = " + getName() + " age = " + getAge());
	}
	
}
