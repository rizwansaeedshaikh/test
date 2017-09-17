package test;

import java.util.Arrays;

public class FindPairGivenSum {

	public static void main(String[] args) {
		
		//Naive approach test
		int array[] = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		findPairByNaiveMethod(array, sum);
		findPairBySortApproach(array, sum);
	}
	
	private static void findPairByNaiveMethod(int[] array, int sum){
		
		for(int i = 0; i < array.length - 1; i++){
			for(int j = i + 1 ; j < array.length; j++){
				if(sum == array[i] + array[j])
					System.out.println("Pair found at index i:" + i + " and j: " + j);	
			}
		}
	}
	
	private static void findPairBySortApproach(int[] array, int sum){
		
		int low = 0;
		int high = array.length - 1;
		
		Arrays.sort(array);
		
		while(low < high){
			
			if(sum == array[low] + array[high])
				System.out.println("Sum found. " + array[low] + " " + array[high]);
			else{
				if(sum > array[low] + array[high])
					low++;
				else
					high++;
			}
		}
	}
}
