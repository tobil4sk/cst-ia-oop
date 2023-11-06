package supo.week1;

import java.util.HashSet;

class Node {
	public final int value;
	public Node next;
	
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}
}

class List {
	private Node head;
	
	List() {
		head = null;
	}
	
	public void add(int value) {
		head = new Node(value, head);
	}
	
	public void remove(int value) {
		if (head != null && head.value == value) {
			head = head.next;
			return;
		}

		Node current = head.next;
		Node previous = head;
		
		while (current != null) {
			if (current.value == value) {
				previous.next = current.next;
			}
			previous = current;
			current = current.next;
		}
	}
	
	public int getHead() {
		return head.value;
	}
	
	public int getNth(int n) {
		Node current = head;
		for (int i = 1; i < n; i++) {
			current = current.next;
		}
		return current.value;
	}
	
	public int getLength() {
		int length = 0;
		
		Node current = head;

		while (current != null) {
			current = current.next;
			length++;
		}
		
		return length;
	}
	
	public boolean hasCycles() {
		HashSet<Node> nodes = new HashSet<Node>();
		Node current = head;
		
		while (current != null) {
			if (nodes.contains(current)) {
				return true;
			}
			nodes.add(current);
			current = current.next;
		}
		return false;
	}
}

public class Lists {

}
