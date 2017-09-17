package test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StackTest {

	@Rule
	public final ExpectedException expectedException = ExpectedException.none();
	
	@Test
	public void sunnyDay() {
		
		Stack stack = new Stack(10);
		for(int count = 1; count <= 10; count++)
			stack.push(count * 10);
		stack.display();
	}
	
	@Test
	public void emptyStack(){
		
		Stack stack = new Stack(10);
		stack.push(1);
		
		expectedException.expect(java.util.NoSuchElementException.class);
		stack.display();
		
		stack.pop();
		stack.display();
	}

}
