package week7.day2;

import java.util.Date;

public class ManagerTest {

	public static void main(String[] args) {
		Date d = new Date();
		
		Manager m1 = new Manager(45, 11, "Alex", 1222, d);
		
		Manager m2 = new Manager(22, 11, "Alex", 1222, d); 
		System.out.println(m1.equals(m2));
		
		System.out.println("m1.hashCode() = " + m1.hashCode() + 
				" m2.hashCode() = " + m2.hashCode());
		System.out.println();

	}

}
