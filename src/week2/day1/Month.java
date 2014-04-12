package week2.day1;

public class Month {
	
	private String name;
	private int num;
	private int days;
	
	public Month(String name, int num, int days){
		this.name = name;
		this.num = num;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
}
