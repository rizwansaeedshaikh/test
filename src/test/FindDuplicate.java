package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

	public int findDuplicate(List<Integer> numbers) {
		
		Set<Integer> setOfNumbers = new HashSet<Integer>();
		for(Integer num : numbers) {
			if(!setOfNumbers.add(num))
				return num;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		for(int count = 0; count < 30; count++) {
			numbers.add(count);
		}
		numbers.add(22);
		FindDuplicate findDuplicate = new FindDuplicate();
		System.out.println(findDuplicate.findDuplicate(numbers));
	}
}
