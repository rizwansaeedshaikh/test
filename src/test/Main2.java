package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main2 {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String input;
			while ((input = in.readLine()) != null) {
				
				StringBuilder sb = new StringBuilder(input);
				
				//System.out.println(sb);
				
				for(int count = 0; count < sb.length() - 1; count++) {
					int current = Integer.parseInt(new Character(sb.charAt(count)).toString());
					int next = Integer.parseInt(new Character(sb.charAt(count + 1)).toString());
					if(areOdd(current, next)) {
						//System.out.println("areOdd " + current + " " + next);
						sb.insert(count + 1, "-");
						count++;
					} else if(areEven(current, next)) {
						//System.out.println("arEven " + current + " " + next);
						sb.insert(count + 1, "*");
						count++;
					}
				}
				
				System.out.println(sb.toString());
				
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * Check if two ints are even. Zero is neither odd nor even.
	 * @return true if both arguments are even.
	 */
	private static boolean areEven(int a, int b) {
		
		if(a == 0 || b == 0)
			return false;
		if(a % 2 == 0 && b % 2 == 0)
			return true;
		return false;
	}
	
	/**
	 * Check if two ints are odd. Zero is neither odd nor even.
	 * @return true if both arguments are odd.
	 */
	private static boolean areOdd(int a, int b) {
		
		if(a == 0 || b == 0)
			return false;
		
		if(a % 2 == 1 && b % 2 == 1)
			return true;
		return false;
	}
}
