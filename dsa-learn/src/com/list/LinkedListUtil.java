package com.list;

public class LinkedListUtil {

	// using recursion
	public static Node reverse(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node prev = reverse(head.next);
		head.next.next = head;
		head.next = null;

		return prev;
	}

	// using reverse Iterative
	public static Node reverseIterative(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node curr = head, prev = null;
		while (curr != null) {

			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}

		return prev;
	}

	public static int findMid(Node head) {

		if (head == null) {
			return -1;
		}

		Node slwPtr = head;
		Node fastPtr = head;

		while (fastPtr.next != null && fastPtr.next.next != null) {
			slwPtr = slwPtr.next;
			fastPtr = fastPtr.next.next;
		}

		return slwPtr.data;

	}

	public static void main(String[] args) {

		ListNode list = new ListNode();
		//list.insert(5);
		list.insert(4);
		list.insert(3);
		list.insert(2);
		list.insert(1);

		list.displayList(list.head);
		// list.head = reverse(list.head);
		//list.head = reverseIterative(list.head);

		System.out.println();

		list.displayList(list.head);
		
		//find mid elem
		
		System.out.println("find Mid ::"+ findMid(list.head));

	}
}
