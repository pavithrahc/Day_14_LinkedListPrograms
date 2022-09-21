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
	 * 
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

	public void addLast(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void deleteFirst() {
		if (head == null)
			System.out.println("No elements to delete...");
		else if (head.next == null)
			head = null;
		else {

			Node temp = head.next;
			head = temp;

		}
	}

	public void search(Object searchData) {
		if (head.data == searchData)
			System.out.println(searchData + " is Found");
		else {
			Node temp = head;

			boolean isFound = false;

			while (temp != null) {
				if (temp.data == searchData) {
					isFound = true;
					break;
				}

				temp = temp.next;
			}

			if (isFound == true)
				System.out.println(searchData + " is Found");
			else
				System.out.println(searchData + " is not found..");
		}
	}

	public int size() {
		int count = 0;

		Node temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;

	}

	public void insertIndex(int userIndex, Object data) {

		// User trying to insert @ first position
		if (userIndex == 0)
			addFirst(data);

		// User trying to insert @ last position
		else if (userIndex == size())
			addLast(data);

		// User trying to insert @ invalid position
		else if (userIndex < 0 || userIndex >= size())
			System.out.println("Invalid index");

		// User trying to insert @ specific index
		else {
			// Creating New Node
			Node newNode = new Node(data);

			// To track traversing
			int index = 0;

			// Pointers to track left & right side elements
			Node left = head;
			Node right = left.next;

			// Traverse or Move till last element before user entered index
			while (index < userIndex - 1) {
				left = left.next;
				right = right.next;
				index++;
			}
			// Connecting new Node with right side elements
			newNode.next = right;
			
			// Connecting left side elements with new Node
			left.next = newNode;
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

		sc.addLast(56);
		sc.addLast(30);
		sc.addLast(70);
		sc.display();
		
	}

}