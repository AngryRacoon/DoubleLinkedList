package org.example;

public class LinkedListNode {
    Object value;
    LinkedListNode next;
    LinkedListNode previous;
    LinkedListNode (Object value, LinkedListNode next, LinkedListNode previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
