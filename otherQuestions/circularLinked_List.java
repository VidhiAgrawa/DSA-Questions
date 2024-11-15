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
class Circular_linkedList{
    Node head;
    Circular_linkedList(){
        head = null;
    }

    // created a function for insertion in which Nodes will be inserted
    void insert( int data ){
        // created a new Node which has value of data
        Node newNode = new Node(data);
        // connecting head to new node if pointing null
        if( head == null ){
            head = newNode;
            newNode.next = head;
        }

        else{
            // else create temporary node equal to head
            Node temp = head;
            // ** here loop stops at last node
            
            // when temps next is not pointing then
            while( temp.next != head ){
                // we will insert heads next in temp so its value gets changed
                temp = temp.next;
            }
            // now temps next is connected to new node
            temp.next = newNode;
            newNode.next = head;
        }
    }
    // fpr displaying the whole list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        
        // ** here loop stops at Null
        
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        while( temp != head );
        System.out.print("back to head ");
    }
}

public class circularLinked_List {
    public static void main(String[] args) {
        Circular_linkedList newList = new Circular_linkedList();
        newList.insert(0);
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.display();
    }
}
