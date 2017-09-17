package test;

public class Test {

	public static void go(Long n) {
		System.out.println("Long ");
	}

	public static void go(Short n) {
		System.out.println("Short ");
	}

	public static void go(int n) {
		System.out.println("int ");
	}

	public static void main(String[] args) {
		short y = 6;
		long z = 7;
		go(y);
		go(z);

		int six = 06; // Equal to decimal 6
		int seven = 07; // Equal to decimal 7
		int eight = 010; // Equal to decimal 8
		int nine = 011; // Equal to decimal 9
		System.out.println("Octal 06 = " + six);
		System.out.println("Octal 07 = " + seven);
		System.out.println("Octal 010 = " + eight);
		System.out.println("Octal 011 = " + nine);
		
		int a = 0x0001;
		int b = 0x7ffffff;
		int c = 0xDeadCafe;
		System.out.println(a + " " + b + " " + c);
		
		char d = (char)70000;
		System.out.println(d);
		System.out.println((char)4465);

	}

}
