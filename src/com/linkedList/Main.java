package com.linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.insertFirst(10);
		singleLinkedList.insertlast(20);
		singleLinkedList.insertlast(30);
		singleLinkedList.insertMiddle(35, 3);
		singleLinkedList.insertlast(40);
		singleLinkedList.insertlast(50);
		singleLinkedList.insertlast(60);
		singleLinkedList.insertlast(70);
		singleLinkedList.display();
		System.out.println();
		singleLinkedList.deleteFirst();
		
		singleLinkedList.display();
		System.out.println();
		
		singleLinkedList.deleteLast();
		singleLinkedList.display();
		System.out.println();
		singleLinkedList.deleteMiddle(2);
		singleLinkedList.display();

	}

}
