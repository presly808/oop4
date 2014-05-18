package week6;

public class BinarySearch {
	
	public static <T extends Comparable<T>> int search(T[] mas, T el){
		int start = 0;
		int end = mas.length - 1;
		
		while(start <= end){
			int mid = start + (end - start) / 2;
			if(el.compareTo(mas[mid]) < 0){
				end = mid - 1;
			} else if(el.compareTo(mas[mid]) > 0){
				start = mid + 1;
			} else {
				return mid; // returning index of element
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		Integer[] mas = {1,2,3,4,5,6,7,8,12,334,4566};
		int ind = BinarySearch.<Integer>search(mas, 34);
		System.out.println(ind);
	}
	
}
