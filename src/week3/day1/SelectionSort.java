package week3.day1;

public class SelectionSort {
	
	public static void sort(int[] mas){
		for(int i = 0; i < mas.length; i++){
			int min = mas[i];
			int minI = i;
			for(int j = i + 1; j < mas.length; j++){
				if(min > mas[j]) {
					min = mas[j];
					minI = j;
				}
			}
			
			int temp = mas[i];
			mas[i] = min;
			mas[minI] = temp;
			
		}
	}
}
