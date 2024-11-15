class Node{
    int data;
    Node next;
    Node( int value ){
        this.data = value;
        this.next = null;
    }
}
class Circular{
    Node head;
    Circular(){
        head = null;
    }

    void insert( int data ){
        Node newNode = new Node(data);
        if( head == null ){
            head = newNode;
            newNode.next = head; 
        }
        else{
            Node temp = head;
            while( temp.next != head ){
                temp= temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }
    void deleteFirst(){
        Node temp = head;
        while( temp.next != head ){
            temp = temp.next;
        }
        temp.next = head.next;
        head = temp.next;
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        
        // ** here loop stops at Null
        // printing the loop values
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        //here while temp is not equal to head
        while( temp != head );
        //if it is equal to the show back to head
        System.out.print("back to head ");
    }
}
public class deleteFirst {
    public static void main(String[] args) {
        Circular newList = new Circular();
        newList.insert(0);
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
        newList.deleteFirst();
        newList.display();
    }
}
