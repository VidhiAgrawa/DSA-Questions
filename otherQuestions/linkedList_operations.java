// creating a node
class Node{
    int data;
    Node next;
    Node( int value ){
        this.data = value;
        this.next = null;
    }
}
// creating a linked list
class linkedList{
    Node head;
    linkedList(){
        head = null;
    }
    //inserting element at first
    void insertFirst( int data ){
        Node node2 = new Node(data);
        node2.next = head;
        head = node2;

    }
    // inserting an elements in a linked list
    void insert( int data ){
        Node newNode = new Node(data);
        if( head == null ){
            head = newNode;
        }
        else{
            Node temp = head;
            while( temp.next != null ){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    //deleting element at first
    void deleteFirst(){
        Node temp = head;
        temp.next = head.next;
        head = temp.next;
    }
    //deleting the last element
    void deleteLast(){
        Node parent = head;
        Node child = parent.next;
        while( child.next != null ){
            parent = child;
            child = child.next;
        }
        parent.next = null;
        child = null;
    }
    //displaying the element
    void display(){
        Node temp = head;
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class linkedList_operations {
    public static void main(String[] args) {
        linkedList newList = new linkedList();
        newList.insertFirst(89);
        newList.insert(0);
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.deleteFirst();
        // newList.deleteLast();
        newList.display();
    }
}
