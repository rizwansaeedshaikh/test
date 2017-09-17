package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import static test.Constants.CAPACITY;
import static test.Constants.SIZE;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!!!");
		
		List<String> list = new ArrayList<String>();
		
		System.out.println("Addition of A to the list returns: "  + list.add("A"));
		list.add("alpha");
		list.add("beta");
		list.add("charlie");
		list.add(list.size(),"This will always be added at the end");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println(element);
		}
		
		StringComparator stringComparator = new StringComparator();
		
		String[] arr = {"C", "c", "A", "D", "d", "a", "b", "B" };
		List<String> temp = Arrays.asList(arr);
		Collections.sort(temp, stringComparator);
		
		System.out.println(temp);
		char c = 'z';
		System.out.println((int)c);
		//65 90 97 122
		
		System.out.println(CAPACITY);
		System.out.println(SIZE);
	}
}

class StringComparator implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2){
		
		if(s1.compareToIgnoreCase(s2) == 0)
			return s1.compareTo(s2);
		return s1.compareToIgnoreCase(s2);
		
	}
}
