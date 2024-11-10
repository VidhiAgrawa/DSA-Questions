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
}   
public class Creation {
    public static void main(String[] args) {
        Tree newTree = new Tree();

        newTree.create(10);
        newTree.create(15);
        newTree.create(3);
        newTree.create(2);
        newTree.create(4);

        // System.out.println("Tree printed in hierarchical form:");
        // newTree.printTree(); // Print the tree in hierarchical format
    }
}