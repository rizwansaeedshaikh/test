package test;

import java.util.NoSuchElementException;

public class Stack {

	private int size;
	private int length;
	private int top;
	private int[] array;

	public Stack(int size) {

		this.size = size;
		this.length = 0;
		this.top = -1;
		this.array = new int[this.size];
	}

	public boolean isEmpty() {

		if (this.top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull(){
		
		if(this.top == this.size - 1)
			return true;
		else
			return false;
	}
	
	public int getSize(){
		return this.length;
	}
	
	public void display(){
		
		if(this.isEmpty())
			throw new NoSuchElementException("Stack underflow!");
		int tempTop = top;
		
		while(tempTop != -1)
			System.out.print(array[tempTop--] + " ");
		
		System.out.println();
		
	}
	
	public void push(int element){
		
		if(isFull())
			throw new IndexOutOfBoundsException("Stack overflow");
		
		System.out.println("push top: " + top);
		
		length++;
		array[++top] = element;
		
	}
	
	public int pop(){
		
		if(this.isEmpty())
			throw new NoSuchElementException("Stack underflow!");
		
		length--;
		return array[top--];
	}
	
	public int peek(){
		
		if(this.isEmpty())
			throw new NoSuchElementException("Stack underflow!");
		
		return array[top];
	}
}
