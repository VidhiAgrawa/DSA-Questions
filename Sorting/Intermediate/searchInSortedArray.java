import java.util.Scanner;

public class searchInSortedArray {
    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,1,2 };
        int left = 0;
        int right = arr.length - 1;

        searchInSortedArray obj = new searchInSortedArray();

        obj.sort(0, arr.length-1, arr);

        System.out.println("Your sorted ARRAY :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the target:- ");
        int target = sc.nextInt();

        obj.Binary(target, left, right, arr);
    }
    public int[] sort(int lower, int upper, int arr[]) {
        int pivot = upper;
        if( lower > upper ) return arr;
        for (int i = lower; i < upper; i++) {
            if( arr[i] > arr[pivot] ){
                int n = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = n;
            }
        }
        sort(lower, pivot -1, arr);
        return arr;
    }
    public int Binary(int target, int left, int right, int[] arr) {
        int mid = left + ( right - left ) / 2;
        if( left > right ) return -1;
        if( arr[mid] == target ){
            System.out.println( "Found at index:- " + mid );
            return 1;
        }
        else if ( arr[mid] > target ){
            right = mid - 1;
            return Binary(target, left, right, arr);
        }
        else if( arr[mid] < target ){
            left = mid + 1;
            return Binary(target, left, right, arr);
        }
        return 0;
    }
}
