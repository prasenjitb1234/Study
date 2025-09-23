package com.learn.linkedlist.telusko;

public class Runner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a linked list object

        // Insert data into the list
        list.insert(5);
        list.insert(12);
        list.insert(18);

        // Display the elements in the list
        System.out.println("Elements in the linked list:");
        list.show();
    }
}
