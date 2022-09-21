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
	public void delete(Object data) {
		Node temp = head, prev =null;
			if (temp != null && temp.data == data) {
				head = temp.next;
				return;
			}
			while (temp != null && temp.data !=data) {
				prev= temp;
				temp = temp.next;
			}
			if(temp == null)
				return;
			prev.next=temp.next;
	}
	public void display() {
		if (head == null)
			System.out.println("No elements to display...");
		else if (head.next == null)
			System.out.println(head.data);
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.next != null)
					System.out.print(temp.data + " ");
				else
					System.out.print(temp.data + "\n");
				temp = temp.next;
			}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to LinkedList programs");
		LinkedList sc = new LinkedList();

		sc.addFirst(56);
		sc.addFirst(30);
		sc.addFirst(70);
		sc.display();
		sc.delete(10);
		sc.display();
		
	}

}