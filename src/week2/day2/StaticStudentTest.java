package week2.day2;

import java.text.SimpleDateFormat;

public class StaticStudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Vova", 24);
		Student s2 = new Student("Anton", 22);
		Student s3 = new Student("Andrey", 25);

		System.out.println(Student.getCount());
		SimpleDateFormat sdf = new SimpleDateFormat();
		StaticStudentTest.showSomeMessage("Hi");
	}
	
	public static void showSomeMessage(String mess){
		System.out.println(mess);
	}

}
