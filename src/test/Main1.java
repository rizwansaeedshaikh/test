package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String input;
			while ((input = in.readLine()) != null) {

				//System.out.println(input);

				String[] tokens = input.split(",");
				String first = tokens[0];
				String second = tokens[1];

				//System.out.println(first);
				//System.out.println(second);

				StringBuilder output = new StringBuilder("");
				
				for (int count1 = first.length() - 1, count2 = second.length() - 1; count1 >= 0
						&& count2 >= 0; count1--, count2--) {

					if(first.charAt(count1) != second.charAt(count2)) {
						if(count1 == first.length() - 1) {
							output = new StringBuilder("LLUN");
						}
						break;
					}
					output.append(new Character(first.charAt(count1)).toString());
				}
				output.reverse();
				System.out.println(output.toString());
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
