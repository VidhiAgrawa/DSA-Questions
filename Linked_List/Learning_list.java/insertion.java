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
class linkedList{
    Node head;
    linkedList(){
        head = null;
    }

    // created a function for insertion in which Nodes will be inserted
    void insert( int data ){
        // created a new Node which has value of data
        Node newNode = new Node(data);
        // connecting head to new node if pointing null
        if( head == null ){
            head = newNode;
        }

        else{
            // else create temporary node equal to head
            Node temp = head;
            // ** here loop stops at last node
            
            // when temps next is not pointing then
            while( temp.next != null ){
                // we will insert heads next in temp so its value gets changed
                temp = temp.next;
            }
            // now temps next is connected to new node
            temp.next = newNode;
        }
    }
    // fpr displaying the whole list
    void display() {
        Node temp = head;
        
        // ** here loop stops at Null
        
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null ");
    }
}

public class insertion {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
    }
}
