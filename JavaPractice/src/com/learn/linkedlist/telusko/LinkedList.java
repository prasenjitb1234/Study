package com.learn.linkedlist.telusko;

public class LinkedList {
    Node head; // Reference to the head (first node)

    // Insert a new node with the given data at the end of the list
    public void insert(int data) {
        Node node = new Node(); // Create a new node
        node.data = data;       // Set the data
        node.next = null;       // By default, the next is null

        if (head == null) {     // If the list is empty
            head = node;        // Set the new node as the head
        } else {
            Node n = head;      // Start from the head

            // Traverse to the last node
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;      // Link the new node at the end
        }
    }

    // Display all the elements in the list
    public void show() {
        Node node = head;       // Start from the head

        while (node != null) {  // Traverse until the end of the list
            System.out.print(node.data + " "); // Print the data
            node = node.next;   // Move to the next node
        }
        System.out.println();   // New line after printing all elements
    }
}
