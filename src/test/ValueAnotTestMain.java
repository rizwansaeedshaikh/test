package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueAnotTestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext();
		System.out.println(context);
	}
}
