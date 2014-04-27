package week4.day1.sorting;

import java.util.Comparator;

public class SeasonComporator implements Comparator<Season> {

	@Override
	public int compare(Season o1, Season o2) {
		return o1.getUkrName().compareTo(o2.getUkrName());
	}

	
}
