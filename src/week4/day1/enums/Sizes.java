package week4.day1.enums;

public enum Sizes {
	
	SMALL(25), MIDDLE(30), LARGE(40);

	private int length;
	

	private Sizes(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}
	
}
