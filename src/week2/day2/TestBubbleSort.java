package week2.day2;

import java.util.Arrays;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] mas = {23,12,1,2,3,4,457,23,-23};
		//call sort method
		int[] sorterMas = BubbleSort.sort(mas);
		// int[] - > String for output
		String res = Arrays.toString(sorterMas);
		
		System.out.println(res);
		
		
	}

}
