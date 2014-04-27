package week4.day2.serial_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import week3.day1.Employee;

public class SerialFileHelper implements IFileHelper {

	@Override
	public void save(Employee[] team, String path) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(team);
		} catch (FileNotFoundException ffe){
			ffe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos != null){
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public Employee[] load(String path) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Employee[] team = null;
		try{
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			team = (Employee[]) ois.readObject();
		} catch (IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(ois != null){
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return team;
	}

}
