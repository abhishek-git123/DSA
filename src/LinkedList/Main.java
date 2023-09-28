package LinkedList;

import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.append(5);
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.append(6);
        myLinkedList.append(2);
        myLinkedList.append(1);
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.prepend(9);
        myLinkedList.prepend(11);
        myLinkedList.getLength();
        myLinkedList.printList();
    }
}
