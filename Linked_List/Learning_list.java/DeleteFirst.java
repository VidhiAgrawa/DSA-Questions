//creating a node
class Node{
    int data;
    Node next;
    Node( int val ){
        this.data = val;
        this.next = null;
    }
}
//creating a linked list
class linkedList{
    Node head;
    linkedList(){
        head = null;
    }
    //inserting an elements in the list
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
    // deleting the first element in the list
    void DeleteFirst(){
        Node temp = head;
        temp.next = head.next;
        head = temp.next;
    }
    //displaying the element on the list
    void display(){
        Node temp = head;
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class DeleteFirst {
    public static void main(String[] args) {
        linkedList newList = new linkedList();
        newList.insert(0);
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.DeleteFirst();
        newList.display();
    }
}
