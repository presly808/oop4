package week5.day1;

import java.util.ArrayList;

public class Group {
	
	public static int count;
	private String name;
	private int id;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	//Nested
	public static class Student {
		String name;
		int age;
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
	
	}
	
	public void addStudent(String name, int age){
		Student s = new Student();
		s.age = age;
		s.name = name;
		students.add(s);
	}
	
	public void showAll(){
		for(Student s : students){
			System.out.println(s);
		}
	}
	
	
}
