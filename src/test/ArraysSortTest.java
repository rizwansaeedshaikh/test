package test;

import java.util.Arrays;
import java.util.Random;

public class ArraysSortTest {

	public static void main(String[] args) {
		
		String[] array = new String[3];
		Random random = new Random();
		
		for(int count = 0; count < array.length; count++)
			array[count] = random.nextInt() + " hi";
		for(String str : array) {
			System.out.println(str);
		}
		Arrays.sort(array);
		for(String str : array) {
			System.out.println(str);
		}
		
		StringBuffer sb1 = new StringBuffer("1");
		StringBuffer sb2 = new StringBuffer("1");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1 == sb2);
		
		String s1 = new String("1");
		String s2 = new String("1");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		String s3 = "2";
		String s4 = "2";
		System.out.println(s3 == s4);
	}
}
