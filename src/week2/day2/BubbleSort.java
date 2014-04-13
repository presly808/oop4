package week2.day2;

public class BubbleSort {

	public static int[] sort(int[] mas){
		
		for(int i = 0; i < mas.length; i++){
			for(int j = 0; j < mas.length - 1; j++){
				if(mas[j] > mas[j+1]){
					swap(mas, j, j+1);
				}
			}
		}
		
		return mas;
	}
	
	public static void swap(int[] mas, int firstI, int secondI){
		int temp = mas[firstI];
		mas[firstI] = mas[secondI];
		mas[secondI] = temp;
	}
}
