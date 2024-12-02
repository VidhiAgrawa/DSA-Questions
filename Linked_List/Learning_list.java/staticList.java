//  Created node here which contains data and reference of next node
class Node{
    int data;
    Node next;
    // Constructor which contains value of data and shows next is connected to null
    Node( int value ){
        this.data = value;
        this.next = null;
    }
}
// linked list class is created
class linkedList{
    // created head of node 
    Node head;
    linkedList(){
        // pointed head to the null
        head = null;
    }

    void staticList(int data){
        Node newNode = new Node(data);
        // making head a new node
        head = newNode;

        // now creating node statically
        Node Node1 = new Node(10);
        newNode.next = Node1;

        Node Node2 = new Node(20);
        Node1.next = Node2;

        Node Node3 = new Node(30);
        Node2.next = Node3;

        // Node Node4 = new Node(40);
        // Node3.next = Node4;

        Node4 = null;


    }
    void display(){
        Node temp = head;
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        // System.out.print("null");
    }
}

public class staticList {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.staticList(0);
        list.display();
    }
}
