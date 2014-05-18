package week6.day2;

public class TestRecursion {
	
	public static void printMasEl(Object[] mas, int i){
		
		//exit cond
		if(i >= mas.length){
			return;
		}
		
		//action
		System.out.print(mas[i] + " ");
		
		//next step
		printMasEl(mas, i + 1);
		
	}
	
	public static void main(String[] args) {
		String[] words = {"City", "Country", "Street", "House"};
		printMasEl(words, 0);
		
		
	}
	
}
