package week4.day1.sorting;

public enum Season {
	
	WINTER("Зима", 30), SPRING("Весна", 90), 
	SUMMER("Літо", 300), AUTUMN("Осінь", 40);
	
	private String ukrName;
	private int days;
	
	private Season(String ukrName, int days) {
		this.ukrName = ukrName;
		this.days = days;
	}

	public String getUkrName() {
		return ukrName;
	}

	public int getDays() {
		return days;
	}
	
	
	
	
}


