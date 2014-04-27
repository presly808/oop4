package week4.day2.serial_ex;

import java.io.FileNotFoundException;

import week3.day1.Employee;

public interface IFileHelper {
	
	void save(Employee[] team, String path) throws FileNotFoundException;
	
	Employee[] load(String path);
	
}
