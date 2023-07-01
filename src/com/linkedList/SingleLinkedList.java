package com.linkedList;

public class SingleLinkedList {

	private Node head;
	private Node tail;

	private int size;

	public SingleLinkedList() {
		this.size = 0;
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size += 1;

	}

	public void insertlast(int val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size += 1;
	}

	public void insertMiddle(int val, int index) {

		if (index == 0) {
			insertFirst(val);
			return;
		}

		if (index == size) {
			insertlast(val);
			return;
		}

		Node temp = head;

		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node node = new Node(temp.next, val);
		temp.next = node;
//		node.next = temp.next.next;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.print("END");
	}
	
	public Node get(int index) {
		Node node = head;
		for(int i = 1; i<index; i++) {
			node = node.next;
		}
		return node;
	}
	
	public int deleteFirst() {
		int value = head.val;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size--;
		return value;
	}
	
	public int deleteLast() {
		if(size <= 1) {
			return deleteFirst();
		}
		int value = tail.val;
		Node node = get(size-1);
		tail = node;
		tail.next = null;
		return value;
	}
	
	public int deleteMiddle(int index) {
		if(index == 0) {
			return deleteFirst();
			
		}
		
		if(index == size-1) {
			return deleteLast();
			
		}
		
		Node node = get(index);
		int value = node.next.val;
		node.next = node.next.next;
		return value;
	}

	private class Node {
		Node next;
		int val;

		public Node(int val) {
			this.val = val;
		}

		public Node(Node next, int val) {
			this.next = next;
			this.val = val;
		}
	}

}
