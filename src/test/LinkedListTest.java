package test;

import org.junit.Test;

import junit.framework.Assert;

public class LinkedListTest {

	LinkedList<Integer> list = new LinkedList<Integer>();
	
	
	@Test
	public void testReverseInGroup() {
		
		System.out.println("testReverseInGroup");
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.display();
		list.reverseInGroup(2);
		list.display();
		System.out.println("testReverseInGroup");
	}
	
	@Test
	public void addTest(){
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.display();
		list.removeHead();
		list.removeHead();
		list.display();
		list.removeHead();
		list.display();
		list.removeHead();
		System.out.println("removed last element also. now displaying list");
		list.display();
	}
	
	@Test
	public void removeTailTest() {
		
		System.out.println("removeTailTest");
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.display();
		list.removeTail();
		list.removeTail();
		list.removeTail();
		list.display();
		System.out.println("removeTailTest");
	}
	
	
	@Test
	public void reverseTest() {
		
		System.out.println("reversetest");
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.reverse();
		list.display();
		System.out.println("reversetest");
	}
	
	@Test
	public void cloneTest() {
		System.out.println("clone test");
		Node<Integer> orig = new Node<Integer>(100, null);
		Node<Integer> cloned = orig.clone();
		System.out.println(cloned);
		Assert.assertNotSame(orig.hashCode(), cloned.hashCode());
		System.out.println("clone test");
	}
}
