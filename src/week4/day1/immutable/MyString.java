package week4.day1.immutable;

public final class MyString {
	
	private final char[] chars;
	
	public MyString(char[] mas){
		chars = mas;
	}
	
	public char[] getChars(){
		return chars;
	}
	
	
}
