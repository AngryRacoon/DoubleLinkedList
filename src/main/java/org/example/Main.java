package org.example;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Minions kevin = new Minions("Kevin", 5);
        Minions bob = new Minions("Bob", 2);
        Minions mike = new Minions("Mike", 3);
        list.insertBegin(bob);
        list.insertBegin(kevin);
        list.insertBegin(mike);
        System.out.println(list);
    }
}