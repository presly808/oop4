package week2.day2;

public class Number {
	
	private int value;
	
	public Number(int value){
		this.value = value;
	}
	
	public Number add(Number num){
		return new Number(value + num.value);
	}
	
	public int toInt(){
		return value;
	}
	
}
