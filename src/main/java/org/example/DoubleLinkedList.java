package org.example;

public class DoubleLinkedList {
    LinkedListNode head = null;
    LinkedListNode tail = null;

    public void insertBegin(Object value) {
        if (head == null) {
            LinkedListNode node = new LinkedListNode(value, null, null);
            head = node;
            tail = node;
        } else {
            LinkedListNode node = new LinkedListNode(value, head, null);
            head.previous = node;
            head = node;
        }
    }

    public void insertEnd(Object value) {
        if (tail == null) {
            LinkedListNode node = new LinkedListNode(value, null, null);
            head = node;
            tail = node;
        } else {
            LinkedListNode node = new LinkedListNode(value, head, null);
            tail.next = node;
            tail = node;
        }
    }

    public Object deleteBegin() {
        if (head == null) {
            return null;
        }
        var result = head.value;
        if (tail == head) {
            this.head = null;
            this.tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        return result;
    }
    public Object deleteEnd() {
        if (tail == null) {
            return null;
        }
        var result = tail.value;
        if (tail == head) {
            this.head = null;
            this.tail = null;
        } else {
            tail = tail.next;
            tail.next = null;
        }
        return result;
    }
}



