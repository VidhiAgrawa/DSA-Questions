//creating the node
class Node{
    int data;
    Node next;
    Node( int val ){
        this.data = val;
        this.next = null;
    }
}
//creating the node
class linkedList{
    Node head;
    linkedList(){
        head = null;
    }
    //inserting an element in the list
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
    // deleting the last element on the list
    void deleteLast(){
        //creating tht parent and child node
        Node parent = head;
        Node child = parent.next;
        // traverse till you find the last node
        while( child.next != null ){
            parent = child;
            child = child.next;
        }
        // if found then make last node null and connect the node before that to null 
        parent.next = null;
        child = null;
    }
    //displaying the elements
    void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class DeleteLast {
    public static void main(String[] args) {
        linkedList newList = new linkedList();
        newList.insert(0);
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.deleteLast();
        newList.display();
    }
}
