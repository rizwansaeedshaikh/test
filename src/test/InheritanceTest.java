package test;

public class InheritanceTest {

	public static void main(String[] args) {
	
		Super1 s = new Super1();
		
		//Sub2 subClassObject = (Sub2)s;  //ClassCastException here
		//subClassObject.doSomething();
		
		s = new Sub2();
		s.doo(); //this works
	}
}

class Super1 {

	void foo() {

		System.out.println("Super foo");
	}

	void doo() {
		System.out.println("Super do");
	}
}

class Sub2 extends Super1 {

	void boo() {
		System.out.println("Sub boo");
	}

	public void doSomething() {
		System.out.println("Sub doo");
	}
}
