package week2.day1;

public class MyDateTest {

	public static void main(String[] args) {
		Month m1 = new Month("May", 5, 31);
		MyDate myDate = new MyDate(2014,m1,14);
		myDate.setDay(25);
		myDate.setYear(2009);
		//myDate.setMonth(3);
		
		myDate.showFullTime();
		

	}

}
