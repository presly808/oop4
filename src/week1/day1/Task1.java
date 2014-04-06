package week1.day1;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of students");
		int size = sc.nextInt();
		
		int[] ages = new int[size];
		String[] names = new String[size];
		
		inputStudents(names, ages, sc);
		
		showStudents(names, ages);// Ctrl + F11
		
	}
	
	public static void inputStudents(String[] names, int[] ages, 
			Scanner inputHelper){
		for(int i = 0; i < names.length; i++){			
			
			System.out.println("Input name of " + (i+1) +" student");
			String name = inputHelper.next();
			
			System.out.println("Input age");
			int age = inputHelper.nextInt();
			
			names[i] = name;
			ages[i] = age;		
		}
		
	}
	
	public static void showStudents(String[] names, int[] ages){
		for(int i = 0; i < names.length; i++){
			System.out.println(i+1+". name = "+ names[i] + 
					" age = " + ages[i]);
		}
	}
	
	

}
