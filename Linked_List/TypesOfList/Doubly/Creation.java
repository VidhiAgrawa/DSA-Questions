class Node{
    Node prev;
    int data;
    Node next;
    Node( int value ){
        this.prev = null;
        this.data = value;
        this.next = null;
    }
}
class Doubly_ll{
    Node head;
    Doubly_ll(){
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
            newNode.prev = temp;
        }
    }
}
public class Creation {
    public static void main(String[] args) {
        Doubly_ll newList = new Doubly_ll();
        newList.insert(0);
        newList.insert(1);
        newList.insert(2);
        newList.insert(3);
        newList.insert(4);
    }
}
