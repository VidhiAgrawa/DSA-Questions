class Node{
    
    int data;
    Node left, right;

    Node( int value ){
        this.data = value;
        this.left = right = null;
    }
}
class Tree{

    Node root;

    Tree(){
        root = null;
    }

    void insert( int data ){
        Node newNode = new Node(data);

        if( root == null ){
            root = newNode;
        }
        else{
            Node temp = root;

            while ( temp != null ) {
                if( data < temp.data ){
                    if( temp.left == null ){
                        temp.left = newNode;
                        break;
                    }
                    temp = temp.left;
                }
                else{
                    if( temp.right == null ){
                        temp.right = newNode;
                        break;
                    }
                    temp = temp.right;
                }
            }

        }
    }
        
    void postorder() {
        System.out.print("Post-order Traversal: ");
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
    void inorder() {
        System.out.print("In-order Traversal: ");
        inorderRec(root);
        System.out.println();
    }
        
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    void preorder() {
        System.out.print("Pre-order Traversal: ");
        preorderRec(root);
        System.out.println();
    }
    
    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
} 


public class In_OrderTraversal {
    
}
