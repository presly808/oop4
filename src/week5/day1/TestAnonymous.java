package week5.day1;

import java.util.Arrays;
import java.util.Comparator;

import week3.day1.Employee;

public class TestAnonymous {

	public static void main(String[] args) {
		Employee[] team = new Employee[5]; 
		team[0] = new Employee("Vasia", 24, 200);
		team[1] = new Employee("Kolia", 21, 200);
		team[2]= new Employee("Petia", 44, 200);
		team[3] = new Employee("Igor", 33, 200);
		team[4] = new Employee("Ivan", 12, 200);
		
	
		Comparator c = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getAge() - o2.getAge();
			}
			
		};
		Arrays.sort(team);

	}

}
