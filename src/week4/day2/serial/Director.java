package week4.day2.serial;

import java.io.Serializable;

import week3.day1.Employee;

public class Director implements Serializable {
	
	private int age;
	private String name;
	private double money;
	private transient Employee empl = new Employee("Olia", 23, 2000);
	
	public Director(int age, String name, double money) {
		super();
		this.age = age;
		this.name = name;
		this.money = money;
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

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Director [age=" + age + ", name=" + name + ", money=" + money
				+ "]";
	}
	
}
