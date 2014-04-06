package week1.day2;

import java.util.Scanner;

public class GroupStudentsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of students");
		int size = sc.nextInt();
		
		Student[] group = inputStudents(size, sc);
	
		showStudents(group);// Ctrl + F11
		
	}
	
	public static Student[] inputStudents(int size, Scanner inputHelper){
		Student[] group = new Student[size]; // create array for students
		
		for(int i = 0; i < group.length; i++){// filling array using loop		
			Student s = new Student(); // create instance of class Student
			System.out.println("Input name of " + (i+1) +" student");
			s.name = inputHelper.next();
			
			System.out.println("Input age");
			s.age = inputHelper.nextInt();
			
			group[i] = s; // add student s to group 
		}
		
		return group;
	}
	
	public static void showStudents(Student[] students){
		
		for(int i = 0; i < students.length; i++){
			System.out.println(i+1+". name = "+ students[i].name + 
					" age = " + students[i].age);
		}
	}

}
