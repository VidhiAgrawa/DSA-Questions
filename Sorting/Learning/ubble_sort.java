public class ubble_sort {
    static void bubble_sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if( arr[i] > arr[j] ){
                    int n = arr[j];
                    arr[j] = arr[i];
                    arr[i] = n;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 38, 13, 90, 96, 33, 69, 25, 98, 11, 23, 53, 10 };
        bubble_sort(arr);

    }
}
