package week4.day1.sorting;

import java.util.Arrays;

public class CatSortingTest {

	public static void main(String[] args) {
		
		Cat c = new Cat("Murchic", 10);
		Cat c1 = new Cat("Apple", 8);
		Cat c2 = new Cat("Bonia", 2);
		
		Cat[] cats = new Cat[3];
		cats[0] = c;
		cats[1] = c2;
		cats[2] = c1;
		
		CatComparator catComparator = new CatComparator();
		
		Arrays.sort(cats, catComparator);
		
		System.out.println(Arrays.toString(cats));

	}

}
