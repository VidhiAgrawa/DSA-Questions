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
        Node node = new Node(data);

        if( root == null ){
            root = node;
        }
        else{
            Node temp = root;

            while ( temp != null ) {
                if( data < temp.data ){
                    if( temp.left == null ){
                        temp.left = node;
                        break;
                    }
                    temp = temp.left;
                }
                else{
                    if( temp.right == null ){
                        temp.right = node;
                        break;
                    }
                    temp = temp.right;
                }
            }

        }
    }
    int calculateHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("   "); // Print spaces
        }
    }

    void printCurrentLevel(Node node, int level, int height) {
        if (node == null) {
            printSpaces(height - level + 1); // Print leading spaces
            System.out.print("   "); // Print placeholder space for null nodes
            return;
        }

        if (level == 1) {
            printSpaces(height - level); // Print leading spaces for the current level
            System.out.print(node.data + " "); // Print node data
        } else if (level > 1) {
            printCurrentLevel(node.left, level - 1, height); // Go left
            printCurrentLevel(node.right, level - 1, height); // Go right
        }
    }

    void printTree() {
        int height = calculateHeight(root);
        for (int i = 1; i <= height; i++) {
            printCurrentLevel(root, i, height);
            System.out.println(); // New line after each level
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

        System.out.println("Tree printed in hierarchical form:");
        newTree.printTree(); // Print the tree in hierarchical format
    }
}