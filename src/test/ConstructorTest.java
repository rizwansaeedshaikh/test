package test;

public class ConstructorTest {

	@SuppressWarnings("unused")
	private int i;
	
	public ConstructorTest(int i) {
		this.i = i;
	}
}

class Sub extends ConstructorTest {
	
	@SuppressWarnings("unused")
	private int j;
	private static int k;
	
	public Sub(){
		//super(j); //CE - Cannot refer to an instance field j while explicitly invoking a constructor
		super(k);
	}
}
