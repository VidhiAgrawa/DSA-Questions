class Node{
    int data;
    Node next;
    Node( int data ){
        this.data = data;
        this.next = null;
    }
}
class merging{
    Node merge( Node head1, Node head2 ){
        Node p1 = head1;
        Node p2 = head2;
        Node dummy = new Node(0);
        Node p3 = null;
        while( p1 != null && p2 != null  ){
            if( p1.data < p2.data ){
                p3.next = p1;
                p1 = p1.next;
            }
            else{
                p3.next = p2;
                p2 = p2.next;
            }
            p3 = p3.next;
        }
        while ( p1 != null ) {
            p3.next = p1;
            p1 = p1.next;
        }
        while ( p2 != null ) {
            p3.next = p2;
            p2 = p2.next;
        }
    }
    Node insert( int arr[] ){
        Node head = null;
        for (int num : arr) {
            Node newNode = new Node(num);
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
        return head;
    }
    void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class merge {
    public static void main(String[] args) {
        merging list = new merging();
        int arr1[] = { 1, 4, 5, 7 };
        int arr2[] = { 2, 3, 6 };
        Node head1 = list.insert(arr1);
        Node head2 = list.insert(arr2);
    }
}
