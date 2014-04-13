package week2.day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd mm:HH");
		Date d = sdf.parse("1999/05/17 33:16");
		
		// change pattern(template)
		sdf.applyPattern("dd-MM-yyyy HH:mm");
		String stringDate = sdf.format(d);
		System.out.println(stringDate);
		

	}

}
