package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindFrequency {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("2");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("4");
		list.add("4");
		list.add("5");
		list.add("5");
		
		//Frequency of a single element
		System.out.println("frequency of 1: " + Collections.frequency(list, "1"));
		
		//Frequency of all elements
		Set<String> uniqueSet = new HashSet<String>(list);
		for(String s : uniqueSet) {
			System.out.println("Frequency of " + s + ": " + Collections.frequency(list, s));
		}
		
		//Frequency of all elements
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String s : list) {
			
			map.put(s, map.get(s) == null ? 1 : map.get(s) + 1);
		}
		
		System.out.println(map);
		int key[];
	}
}
