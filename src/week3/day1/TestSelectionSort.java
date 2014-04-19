package week3.day1;

import java.util.Arrays;

public class TestSelectionSort {

	public static void main(String[] args) {
		int[] mas = {34,12,1,4,8,45,2,1,-34};
		SelectionSort.sort(mas);
		
		System.out.println(Arrays.toString(mas));

	}

}
