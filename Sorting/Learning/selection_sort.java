public class Selection_sort {
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
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 12, 10, 43, 76, 9, 5 };
        sort(arr);
    }
}
