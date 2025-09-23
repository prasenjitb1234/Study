package com.learn.linkedlist;



public class ListNode {
	public int val;
	public ListNode next;
	
	
	public ListNode(int x) {
		val = x;
	}
	
	public static void main(String args[]) {
		// create 3 nodes 
		
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(8);
		ListNode l3 = new ListNode(15);
		
		
		// link the nodes 
		
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		
		// print values 
		
		ListNode ptr = l1; // head 
		
		while(ptr != null) {
			System.out.println(ptr.val);
			ptr = ptr.next;
		}
	}
	
}
