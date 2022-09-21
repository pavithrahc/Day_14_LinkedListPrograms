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

	// pushing new data
	public void push(int data) {

		Node newNode = new Node(data);		//new object created

		if (head == null) {
			head = newNode;

		} else {
			Node temp = head;		// create temp variable and point the address and traversing 
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;

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

		sc.push(56);
		sc.push(30);
		sc.push(70);
		sc.display();
	}

}