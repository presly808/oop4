package week4.day2.serial_ex;

import java.util.Arrays;

import week3.day1.Employee;

public class TestMasSerial {

	public static final String PATH = "f:/team.txt";
	
	public static void main(String[] args) {
		Employee[] team = genEmployeeMas();
		
		SerialFileHelper sfh = new SerialFileHelper();
		sfh.save(team, PATH);
		
		Employee[] loadedTeam =  sfh.load(PATH);
		System.out.println(Arrays.toString(loadedTeam));
		

	}
	
	public static Employee[] genEmployeeMas(){
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("Vova", 43, 1279);
		employees[1] = new Employee("Andrey", 17, 1279);
		employees[2] = new Employee("Bogdan", 29, 1279);
		employees[3] = new Employee("Ivan", 22, 1279);
		employees[4] = new Employee("Vasia", 20, 1279);
		return employees;
		
	}

}
