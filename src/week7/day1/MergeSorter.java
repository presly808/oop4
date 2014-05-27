package week7.day1;

import java.util.Arrays;

public class MergeSorter {

	
	public static Comparable[] merge(Comparable[] mas, int start, int mid, int end){
		Comparable[] res = new Comparable[end - start];
		
		int i = start;
		int j = mid;
		
		for(int k = 0; k < res.length; k++){
			if(i >= mid) res[k] = mas[j++];
			else if(j > end) res[k] = mas[i++];
			else if(mas[i].compareTo(mas[j]) < 0) res[k] = mas[i++];
			else res[k] = mas[j++];
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Integer[] mas = {4,12,67,77, 0, 1,6,56,110};
		Comparable[] res = merge(mas, 0, 4, mas.length - 1);
		System.out.println(Arrays.toString(res));
	}
}
