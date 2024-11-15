//creating a node
class Node{
    int data;
    Node next;
    Node( int val ){
        this.data = val;
        this.next = null;
    }
}
//creating a list
class linkedList{
    Node head;
    linkedList(){
        head = null;
    }
    // inserting a data into a list
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
    // deleting the mid element on the list
    void deleteMid( int data ){
        // if head points to the null it means that list is empty
        if( head == null ){
            System.out.println( "list is empty");
        }
        // if data of head is the data we want to delete then delete head and make head ka next head
        if( head.data == data ){
            head = head.next;
        }
        // if data is in middle of the list then create a parent and child node
        Node parent = head;
        Node child = parent.next;
        //we will traverse to find the data we need
        while( child != null ){
            //if data is found
            if( child.data == data ){
                // making next of child node as the next of parent node 
                parent.next = child.next;
                // and making the child  node as a null
                child = null;
            }
            //if data not found then move further
            else{
                parent = child;
                child = child.next;
            }
        } 


    }
    //displaying the whole data
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

public class DeleteMid {
    public static void main(String[] args) {
        linkedList newList = new linkedList();
        newList.insert(0);
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.deleteMid(2);
        newList.display();
    }
}
