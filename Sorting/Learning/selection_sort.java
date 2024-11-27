public class selection_sort {
    static void sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if( arr[j] < arr[minIndex] ){
                    int temp = arr[j]; 
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t" );
        }
    }
    public static void main(String[] args) {
        int arr[] = { 12, 100, 93, 73, 90, 5 };
        sort(arr);
    }
}
