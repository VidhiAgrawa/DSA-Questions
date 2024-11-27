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
public class Creation {
    public static void main(String[] args) {
        Tree newTree = new Tree();

        newTree.create(12);
        newTree.create(32);
        newTree.create(15);
        newTree.create(4);
        newTree.create(65);
        newTree.create(10);
        newTree.create(9);
        newTree.display();

    }
}