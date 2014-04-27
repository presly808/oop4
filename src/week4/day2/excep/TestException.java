package week4.day2.excep;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException {

	public static void main(String[] args) {
		
		int[] mas = {1,2,3};
		
		//int a = mas[5];
		
		//System.out.println("After ex");
		
		try {
			getFromChar('4');
			parse("asfknld");
		} catch (NotNumberException e) {
			e.printStackTrace();
		} catch (ParseException e){
			e.printStackTrace();
		}
		
		
	}
	
	public static Date parse(String s) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(s);
		return d;
	}
	
	//try - catch
	public static Date parse2(String s) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = null;
		try {
			d = sdf.parse(s);
			System.out.println("after parse in parse2 method");
		} catch (ParseException pe){
			pe.printStackTrace();
			System.out.println("In catch block");
		}
		
		return d;
	}
	
	public static int getFromChar(char c) throws NotNumberException {
		int num = -1;
		if(c > 47 && c < 58){
			num = c;
		} else {
			throw new NotNumberException(c + " is not a number");
		}
		return num;
	}

}
