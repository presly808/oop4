package week4.day2.serial_ex;

import java.io.FileNotFoundException;

import week3.day1.Employee;

public class TestMySerial {
	
	public static void main(String[] args) throws FileNotFoundException {
		Employee[] team = TestMasSerial.genEmployeeMas();
		MySerialFileHelper myHelper = new MySerialFileHelper();
		myHelper.save(team, "f:/team1.txt");
	}
}
