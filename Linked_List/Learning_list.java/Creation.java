//  Created node here which contains data and reference of next node

class Node{
    int data;
    Node next;

    // Constructor which contains value of data and shows next is connected to null
    public Node(int value){
        this.data = value;
        this.next = null;
    }
}
// Created Linked List class which contains head of Node

class linkedList {
    Node head;
    linkedList(){
        head = null;
    }
    
}

public class Creation {
    public static void main(String[] args) {
        linkedList list = new linkedList();
    }
}
