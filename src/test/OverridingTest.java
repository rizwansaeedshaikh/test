package test;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

class Super {
	
	Object foo() throws SQLClientInfoException {
		System.out.println("Super");
		return new Object();
	}
}
class Sub1 extends Super {
	protected Number foo(int i) throws SQLException {
		System.out.println("Sub");
		return new Integer(1); 
	}
}

class SubOfSub1 extends Sub1 {
	public Integer foo() throws SQLClientInfoException  {
		System.out.println("SubOfSub1");
		return new Integer(1);
	}
}
public class OverridingTest {

	
}
