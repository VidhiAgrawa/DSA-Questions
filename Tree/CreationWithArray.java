public class CreationWithArray {
    int tree[];
    int size;

    CreationWithArray( int len ){
        tree = new int[len];
        size = 0;
    }
    void insert( int value ){
        if( size > tree.length - 1 ){
            throw new IndexOutOfBoundsException("Tree is full");
        }
        tree[size++] = value;
    }

    void printTree() {
        for (int i = 0; i < size; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CreationWithArray tree = new CreationWithArray(7);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        
        tree.printTree();
    }
}
