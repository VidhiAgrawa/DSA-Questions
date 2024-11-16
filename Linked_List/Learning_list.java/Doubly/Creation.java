
class Node{
    Node prev;
    int data;
    Node next;
    Node( int data ){
        this.data = data;
        this.prev = null;
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
    void deleteMid( int data ){
        Node parent = head;
        Node child = parent.next;
        while( child != null ){
            if( child.data == data ){
                parent.next = child.next;
                if( child.next != null ){
                    child.next.prev = parent;
                }
                child = null;
            }
            else{
                parent = child;
                child = child.next;
            }
        }
        
    }
    void display(){
        Node temp = head;
        while ( temp != null ) {
            System.out.print( temp.data + " <- " );
            temp = temp.next;
        }
        System.out.println("null");
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
        newList.deleteMid(2);
        newList.display();
    }
}
