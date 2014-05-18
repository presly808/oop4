package week6.day1;

import sunw.io.Serializable;

public class GenericPair <K extends Comparable,T> {
	
	private K one; // cant create instance of generic
	private T second;
	
	
	public K getOne() {
		return one;
	}
	
	public void setOne(K one) {
		this.one = one;
	}
	
	public T getSecond() {
		return second;
	}
	
	public void setSecond(T second) {
		this.second = second;
	}
	
	public void action(){
		
	}
	
	
	
}
