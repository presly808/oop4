package week2.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStudent {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormatter = 
				new SimpleDateFormat("yyyy/MM/dd");
		// Date to String
		String stringDate = dateFormatter.format(new Date());
		System.out.println(stringDate);
		
		Student s = new Student();
		//String to Date
		s.start = dateFormatter.parse("2013/05/15");
		
		
		s.showStudyTime();

	}

}
