class Node{
    int data;
    Node next;
    Node( int val ){
        this.data = val;
        this.next = null;
    }     
}
class LinkedList{
    Node head;
    LinkedList(){
        head = null;
    }
    // for inserting element at first
    void insertFirst( int data ){
        //create new node 
        Node newNode1 = new Node(data);
        //connect next of new node to head
        newNode1.next = head;
        // and make newnode a head
        head = newNode1;
    }
    // inserting elements
    void insert( int data ){
        Node newNode = new Node(data);
        if ( head == null ){
            head = newNode;
        }
        else{
            Node temp = head;
            while ( temp.next != null ) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    // displaying elements
    void display(){
        Node temp = head;
        while ( temp != null ) {
            System.out.print( temp.data + " -> " );
            temp = temp.next;
        }
        System.out.print("null");
    }
}
public class Insert_First {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(0);
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        
    }
}
