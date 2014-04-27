package week4.day1.sorting;

import java.util.Arrays;
import java.util.Collections;

import week3.day1.Employee;

public class SortJavaEx {

	public static void main(String[] args) {
		
		Employee[] team = new Employee[4];
		for(int i = 0; i < team.length; i++){
			team[i] = new Employee("" + i,(int)(Math.random() * 40), 1200);
		}
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(team));
		
		
		Arrays.sort(team);
		
		System.out.println("After sorting");
		System.out.println(Arrays.toString(team));

		Season[] seasons = Season.values();
		Arrays.sort(seasons, new SeasonComporator());
		System.out.println(Arrays.toString(seasons));
		
		
	}

}
