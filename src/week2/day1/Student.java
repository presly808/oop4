package week2.day1;

import java.util.Date;

public class Student {
	
	String name;
	int age;
	Date start = new Date();
	
	public void showStudyTime(){
		System.out.println("start " + start.getTime());
		Date end = new Date();
		System.out.println("end " + end.getTime());
		long time = end.getTime() - start.getTime();
		int hours = (int)((time / 1000) / 3600);
		System.out.println("Hours of study " + hours);
		
	}
	
	
}
