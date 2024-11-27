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

    void create( int data ){
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

    void delete(int key) {
        root = deleteNode(root, key);
    }

    private Node deleteNode(Node root, int key) {
        if (root == null) return null;
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {

            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

          
            Node successor = findMin(root.right);
            root.data = successor.data; 
            root.right = deleteNode(root.right, successor.data);
        }
        return root;
    }

    private Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    void display() {
        
        // System.out.print("");
        System.out.print("\nInorder Traversal: ");
        // System.out.println("");
        inorder(root);
        System.out.println();
    }

    // Helper function for inorder traversal
    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
} 

public class delete {
    public static void main(String[] args) {
        Tree newTree = new Tree();
        
        newTree.create(96);
        newTree.create(8);
        newTree.create(73);
        newTree.create(7);
        newTree.create(26);
        newTree.create(10);
        newTree.create(9);

        System.out.println("Before Deletion:");
        newTree.display();

        newTree.delete(96); 
        System.out.println("After Deleting 3:");
        newTree.display();

        newTree.delete(7); 
        System.out.println("After Deleting 10:");
        newTree.display();

    }
}
