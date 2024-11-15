class Node{
    int data;
    Node next;
    Node( int val ){
        this.data = val;
        this.next = null;
    }
}
class linkedList{
    Node head;
    linkedList(){
        head = null;
    }

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

    void DeleteFirst(){
        Node temp = head;
        temp.next = head.next;
        head = temp.next;
    }
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
