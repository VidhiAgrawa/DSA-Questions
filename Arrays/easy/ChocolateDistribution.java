import java.util.*;
public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 1, 3 };
        sort(0, arr.length-1, arr);
        System.out.println("sorted array:- ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        choco_Distri(arr, 0, 0);
    }
    public static int[] sort(int lower, int upper, int[] arr) {
        int pivot = upper;
        if( lower > upper ) return arr;
        for (int i = lower; i < upper; i++) {
            if( arr[i] > arr[pivot] ){
                int temp = arr[i] ;
                arr[i] = arr[pivot];
                arr[pivot] = temp;
            }
        }
        sort(lower, pivot - 1, arr);
        return arr;
    }
    public static void choco_Distri(int arr[], int last, int first) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNumber of student:- ");
        int numStd = sc.nextInt();
        int[] newArr = new int[numStd];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("choco distributed:- ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
        last = newArr.length-1;
        first = 0;
        int min = newArr[last] - newArr[first];
        System.out.println("\nMinimum differnce:- " + min);
        // System.out.println();
    }

}

