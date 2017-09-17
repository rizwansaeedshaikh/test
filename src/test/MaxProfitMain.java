package test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxProfitMain {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> stockPrice = new LinkedHashMap<Integer, Integer>();
		stockPrice.put(1, 11);
		stockPrice.put(2, 1);
		stockPrice.put(3, 0);
		stockPrice.put(4, 2);
		stockPrice.put(5, 0);
		stockPrice.put(6, 13);
		stockPrice.put(7, 8);
		stockPrice.put(8, 10);
		stockPrice.put(9, 15);
		stockPrice.put(10, 6);
		stockPrice.put(11, 5);
		
		MaxProfitCalculator calc = new MaxProfitCalculator();
		calc.calculate(stockPrice);
	}
	
	
}

class MaxProfitCalculator {
	
	public void calculate(Map<Integer, Integer> stockPrice) {
		
		int maxDiff = 0;
		int[] hoursWithMaxDiff = {0,0};
		
		Iterator<Integer> hourIter = stockPrice.keySet().iterator();
		while(hourIter.hasNext()) {
			
			Integer hour = hourIter.next();
			Integer price = stockPrice.get(hour);
			
			Iterator<Integer> innerHourIter = stockPrice.keySet().iterator();
			while (innerHourIter.hasNext()) {
				Integer innerHour = (Integer) innerHourIter.next();
				Integer innerPrice = stockPrice.get(innerHour);
				
				if(hour >= innerHour)
					continue;
				if(maxDiff < (innerPrice - price)) {
					maxDiff = innerPrice - price;
					hoursWithMaxDiff[0] = hour;
					hoursWithMaxDiff[1] = innerHour;
				}
				
			}
			
		}
		
		System.out.println("Max difference: " + maxDiff + " at " + hoursWithMaxDiff[0] + " " + hoursWithMaxDiff[1]);
	}
}
