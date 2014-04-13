package week2.day2;

public class Student {
	
	private String name;//null
	private int age;
	
	private static int count;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
		count++;
	}
	
	public static int getCount(){
		return count;
	}
	
	public String getName(){
		return name;
	}
	
}
