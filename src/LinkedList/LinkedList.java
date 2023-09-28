package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void append(int value){
        Node appendedNode = new Node(value);
        if(head == null){
            head = appendedNode;
            tail = appendedNode;
        }else{
            tail.next = appendedNode;
            tail = appendedNode;
        }
        length++;
    }

    public void prepend(int value){
        Node prependNode =  new Node(value);
        if(head == null){
            head = prependNode;
            tail = prependNode;
        }else{
            prependNode.next = head;
            head = prependNode;
        }
        length++;
    }

    public void removeLast(){
        Node temp = head;
        Node pre = head;
        if(head == tail){
            head = null;
        }else {
            while (temp.next != null) {
                pre =temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
        }
        length--;
    }

    public void getHead() {
        System.out.println("head : "+ head.value);
    }

    public void getTail() {
        System.out.println("tail : " + tail.value);
    }

    public void getLength() {
        System.out.println("\nLength : " + length);
    }
}
