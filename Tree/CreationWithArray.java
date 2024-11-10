class Node{
    int data;
    Node left, right;

    Node( int value ){
        this.data = value;
        this.left = this.right = null;
    }
}
class Tree{
    Node root;

    Tree(){
        root = null;
    }

    void TreeArr( int data ){
        Node newNode = new Node(data);

        if ( root == null ){
            root = newNode;
        }
        else{
            Node temp = root;

            while( temp != null ){
                if( data < temp.data ){
                    if( temp.left == null ){
                        temp.left = newNode;
                        break;
                    }
                    temp = temp.left;
                }
                else if( data > temp.data ){
                    if( temp.right == null ){
                        temp.right = newNode;
                        break;
                    }
                    temp = temp.right;
                }
                else{
                    break;
                }
                
            }
        }
    }
}



public class CreationWithArray {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
             tree.TreeArr(arr[i]);
        }
    }
}
