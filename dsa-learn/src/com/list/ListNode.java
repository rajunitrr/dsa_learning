package com.list;

public class ListNode {
	Node head;

	public ListNode() {
	}

	// insert at first
	public void insert(int data) {

		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}

	}

	public void displayList(Node head) {

		if (head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public Node getHead() {
		return head;
	}

}