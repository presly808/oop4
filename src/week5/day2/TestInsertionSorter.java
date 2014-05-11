package week5.day2;

import java.util.Arrays;

public class TestInsertionSorter {

	public static void main(String[] args) {
		int[] mas1 = {-34, 22,11,9,8}; 
		Integer[] mas = {56,23,12,78,33,-12};
		String[] mas2 = {"new", "1", "Kolia", "Company"};
		
		InsertionSorter insertionSorter = new InsertionSorter();
		insertionSorter.sort(mas2);
		System.out.println(Arrays.toString(mas2));

	}

}
