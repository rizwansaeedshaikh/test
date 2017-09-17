package test;

public class Pramid {

	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 3 - i; j++)
				System.out.print("  ");
			for(int k = 0; k < i + 1; k++)
				System.out.print("* ");
			for(int l = 0; l < i; l++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 3 - i; j++)
				System.out.print("  ");
			for(int k = 0; k < i + 1; k++)
				System.out.print(k + 1 +" ");
			for(int l = 0; l < i; l--)
				System.out.print(l + 1 + " ");
			System.out.println();
		}
	}
}

/*
 *       *
 *     * * *
 *   * * * * *
 * * * * * * * *
 * 
 *       1
 *     1 2 1
 *   1 2 3 2 1
 * 1 2 3 4 3 2 1
 * 
 * 
 * 
 */
