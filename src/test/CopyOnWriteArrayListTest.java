package test;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

	public static void main(String[] args) throws InterruptedException {
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Thread t1 = new Thread(new MutateCopyOnWriteArrayList(list), "t1");
		Thread t2 = new Thread(new MutateCopyOnWriteArrayList(list), "t2");
		Thread t3 = new Thread(new TraverseCopyOnWriteArrayList(list), "t3");
		
		t3.start();
		t1.start();
		//t2.start();
		
		
		t1.join();
		t2.join();
		
		Thread.sleep(1000);
		System.out.println(list);
		
	}
}

class MutateCopyOnWriteArrayList implements Runnable {

	public MutateCopyOnWriteArrayList(CopyOnWriteArrayList<Integer> list) {
		super();
		this.list = list;
	}

	/**
	 * @return the list
	 */
	public CopyOnWriteArrayList<Integer> getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(CopyOnWriteArrayList<Integer> list) {
		this.list = list;
	}

	private CopyOnWriteArrayList list;

	@Override
	public void run() {

		System.out.println("adding 111 " + list.add(111));
		System.out.println("removing 2 " + list.remove(2));
		
	}
}

class TraverseCopyOnWriteArrayList implements Runnable {
	
	private CopyOnWriteArrayList<Integer> list;

	public TraverseCopyOnWriteArrayList(CopyOnWriteArrayList<Integer> list) {
		super();
		this.list = list;
	}

	/**
	 * @return the list
	 */
	public CopyOnWriteArrayList<Integer> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(CopyOnWriteArrayList<Integer> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		
		
		Iterator<Integer> it = list.iterator();
		System.out.println("Iteration started");
		Thread.yield();
		for(; it.hasNext(); ) {
			
			System.out.println(Thread.currentThread().getName() + " " + it.next());
		}
		System.out.println("Iteration ended");
	}
	
}