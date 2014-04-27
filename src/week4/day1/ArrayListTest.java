package week4.day1;

import java.util.ArrayList;

import week3.day1.Employee;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>(30);
		list.add(new Employee("1", 1, 1));
		list.set(0, new Employee("2", 2, 2));
		
	}

}
