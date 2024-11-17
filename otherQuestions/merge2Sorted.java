class Node{
    int data;
    Node next;
    Node( int data ){
        this.data = data;
        this.next = null;
    }
}
class linkedList{
    Node merge( Node head1, Node head2 ){
        Node p1 = head1;
        Node p2 = head2;
        Node dummy = new Node(-1);
        Node p3 = dummy;

        while( p1 != null && p2 != null ){
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
        
        while( p1 != null ){
            p3.next = p1;
            p1 = p1.next;
            p3 = p3.next;
        }
        while( p2 != null ){
            p3.next = p2;
            p2 = p2.next;
            p3 = p3.next;
        }
        return dummy.next;
    }
    void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    Node insert( int arr[] ){
        Node head = null;
        for( int num : arr ){
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

}
public class merge2Sorted {
    public static void main(String[] args) {
        int arr1[] = { 1, 4, 5, 7 };
        int arr2[] = { 2, 3, 6 };
        linkedList list = new linkedList();
        Node head1 = list.insert(arr1);
        Node head2 = list.insert(arr2);

        Node printing = list.merge(head1, head2);
        list.display(printing);
    }
}
