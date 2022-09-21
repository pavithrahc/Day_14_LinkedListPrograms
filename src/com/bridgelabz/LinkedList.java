/**
 * 
 */
package com.bridgelabz;

/**
 * @author PAVITHRA C
 * @param <K>
 *
 */
public class LinkedList<K> {

	/**
	 * @param args
	 * UC1-To create a simple linked list
	 */
	
	public Node head;// null

	public class Node { 		//inner class

		Object data;	//int ,double,string....
		Node next;		//address to point

		public Node(Object data) {		//constructor 
			this.data = data;

		}
	}

	public void addFirst(Object data) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			head = newNode;
			head.next = temp;

		}
	}

	// Display all Node with Value
	public void display() {

		if (head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to LinkedList programs");
		LinkedList sc = new LinkedList();

		sc.addFirst(70);
		sc.addFirst(30);
		sc.addFirst(56);
		sc.display();
		
	}

}