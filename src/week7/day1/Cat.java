package week7.day1;

import java.util.Date;

public class Cat implements Cloneable {
	
	private int age;
	private String name;
	private Date date;
	
	public Cat(int age, String name, Date date) {
		super();
		this.age = age;
		this.name = name;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Cat cat = (Cat) super.clone(); 
		
		cat.name = name + "";
		cat.date = (Date) date.clone();
		
		return cat;
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + ", date=" + date + "]";
	}
	
	
	
	
	
}
