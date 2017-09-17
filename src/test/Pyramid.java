package test;

public class Pyramid {

	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < (4 - i); j++) {
				System.out.print("  ");
			}
			for(int k = 0; k <= i; k++ ) {
				System.out.print((k + 1) + " ");
			}
			for(int j = i; j > 0; j--) {
				System.out.print(j  + " ");
			}
			System.out.println();
		}
	}
}

/**
 *      1
 *    1 2 1
 *  1 2 3 2 1
 *1 2 3 4 3 2 1 
 * 
 * */
