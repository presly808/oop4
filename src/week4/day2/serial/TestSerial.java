package week4.day2.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerial {

	public static final String FILE_PATH = "f:/SerialDirector.txt";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Director d = new Director(20, "Anton", 2000);
		System.out.println("Before " + d);
		
		FileOutputStream fos = new FileOutputStream(FILE_PATH);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(FILE_PATH);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Director inputDir = (Director) ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println("after " + inputDir);
		
	}

}
