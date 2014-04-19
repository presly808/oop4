package week3.day1;

public class Programmer extends Employee {
	
	private String programmingLanguage;

	public Programmer() {
		super();
	}

	public Programmer(String name, int age, 
			double salary, String programmingLanguage) {
		super(name, age, salary);
		this.programmingLanguage = programmingLanguage;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	public void coding(){
		System.out.println("Im coding...");
	}
	
	public void coding(int hours){
		System.out.println("I will be coding " + hours + " hours");
	}
	
	public boolean equals(Object empl){
		if(this == empl){
			return true;
		} 
		
		if(empl == null){
			return false;
		}
		
		if(empl.getClass() != Programmer.class){
			return false;
		}  
		
		Programmer other = (Programmer)empl;
		
		if(getName().equals(other.getName()) && getAge() == other.getAge()){
			return true;
		}
		
		return false;
	}
	
}
