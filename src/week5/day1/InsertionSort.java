package week5.day1;

import java.util.Arrays;

public class InsertionSort {
	
	
	public static void sort(int[] mas){
		
		for(int i = 1; i < mas.length; i++){
			
			for(int j = i; j > 0 && mas[j] < mas[j-1]; j--){
					int temp = mas[j];
					mas[j] = mas[j- 1];
					mas[j-1] = temp;
			}	
		}
	}
	
	public static void main(String[] args) {
		int[] mas = {78,1,2,-45,12,8};
		sort(mas);
		System.out.println(Arrays.toString(mas));
	}
}
