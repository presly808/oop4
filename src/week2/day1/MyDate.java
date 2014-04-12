package week2.day1;

public class MyDate {
	
	private int year;
	private Month month;
	private int day;
	private int hours;
	private int minutes;
	
	private String errMessage = "Invalid ";
	private boolean isValid = true;
	
	public MyDate(){
		
	}
	
	public MyDate(int year, Month month, int day){
		validate(year,month,day);

		if(!isValid){
			System.out.println(errMessage);
		}
	}
	
	private void validate(int year, Month month, int day){
		if(year > 0){
			this.year = year;
		} else {
			errMessage += "year ";
			isValid = false;
		}	
		
		if(month.getNum() > 0 && month.getNum() < 13){
			this.month = month; 
		} else {
			errMessage += "month ";
			isValid = false;
		}
		if(day > 0 && day <= month.getDays()){
			this.day = day;			
		} else {
			errMessage += "day";
			isValid = false;
		}
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setMonth(Month month){
		this.month = month;
	}
	
	public Month getMonth(){
		return month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public int getDay(){
		return day;
	}
	
	public void showTime(){
		System.out.println(hours + ":" + minutes);
	}
	
	public void showFullTime(){
		if(!isValid){
			System.out.println(errMessage);
		} else {
			System.out.println(day+"/"+month.getNum()+"/"+year+" "+
					hours+":"+minutes);
		}
	}
}
