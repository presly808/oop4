package week4.day2.serial_ex;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import week3.day1.Employee;

public class MySerialFileHelper implements IFileHelper {

	@Override
	public void save(Employee[] team, String path) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(path);
		for(Employee e : team){
			pw.println(e.toString());
		}
		pw.close();
		
	}

	@Override
	public Employee[] load(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
