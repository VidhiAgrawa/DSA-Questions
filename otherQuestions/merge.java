class Node{
    int data;
    Node next;
    Node( int data ){
        this.data = data;
        this.next = null;
    }
}
class merging{
    // Node merge(  ){
        
    // }
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
