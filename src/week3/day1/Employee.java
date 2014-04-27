package week3.day1;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable {
	
	private String name;
	private int age;
	private double salary;
	
	public Employee(){
		super();
	}
	
	public Employee(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// Shift + Alt + S
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printInfo(){
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "name = " + name 
				+ " age = " + age + " salary = " + salary;
	}

	
	@Override
	public int compareTo(Employee o) {
		if(this.age < o.getAge()){
			return -1;
		} else if(this.age > o.getAge()){
			return 1;
		}
		return 0;
	}
	

}
