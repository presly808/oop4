package week7.day2.collec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class TestCollections {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list = new LinkedList<>(); 
		
		
		Set<String> set = new HashSet<>();
		
		set = new TreeSet<>();
		set.add("vector");
		set.add("line");
		set.add("alg");
		set.add("sum");
		set.add("num");
		set.add("111");
		set.add("vector");
		
		for(String s : set){
			System.out.println(s);
		}
		
		
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Vova", 93987);
		map.put("Sasha", 7865);
		map.put("Losha", 1122);
		map.put("Valeriy", 7865);
		
		System.out.println(map.get("Sasha"));
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet){
			System.out.println(entry);
		}
		
	}

}
