public class bubble_sort {
    static void Bubble_sort(int arr[]){
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
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 12, 10, 43, 76, 9, 5 };
        Bubble_sort(arr);

    }
}
