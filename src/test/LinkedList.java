package test;

public class LinkedList<T> {

	private Node<T> head;
	private int size;

	public LinkedList() {
		super();
	}

	private Node<T> generateNode(T element) {

		Node<T> newNode = new Node<T>(element, null);

		return newNode;
	}

	public void display() {

		// No elements
		if (this.head == null) {
			return;
		}

		// some elements are present
		Node<T> current = this.head;
		System.out.println(current.getData());
		while (current.getNext() != null) {

			current = current.getNext();
			System.out.println(current.getData());
		}
	}

	public void add(T element) {

		Node<T> newNode = generateNode(element);

		if (head == null) {
			this.head = newNode;
		} else {
			Node<T> current = this.head;
			while (current.getNext() != null) {

				current = current.getNext();
			}
			current.setNext(newNode);
		}
		this.size++;
	}

	public void removeTail() {

		if (this.head == null)
			return;

		Node<T> current = this.head;
		Node<T> prev = null;
		while (current.getNext() != null) {
			prev = current;
			current = current.getNext();
		}
		System.out.println("prev data" + prev.getData());
		prev.setNext(null);
		this.size--;

	}

	public void removeHead() {

		if (head == null)
			return;
		head = head.getNext();
	}

	public int size() {

		return this.size;
	}

	public void reverse() {

		Node<T> current = null, prev = null, next = null;

		current = this.head;
		while (current != null) {

			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}

		this.head = prev;
	}

	public void reverseInGroup(int k) {

		Node<T> current = null, prev = null, next = null;

		current = this.head;
		Node<T> thead = this.head;

		while (current != null) {
			//current = thead;
			int count = 0;
			while (count < k) {

				next = current.getNext();
				current.setNext(prev);
				prev = current;
				current = next;
				count++;

			}
			thead = prev;
		}
	}
}
