package week4.day1.sorting;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat>{

	// if(){ retunr 5}
	@Override
	public int compare(Cat o1, Cat o2) {
		return o1.getAge() < o2.getAge() ? -1 : 
								o1.getAge() > o2.getAge() ? 1 : 0;
	}

	
}
