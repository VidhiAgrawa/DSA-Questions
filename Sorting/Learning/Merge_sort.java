// for creating a merge sort we work on the principle of divide and conquer
public class Merge_sort {
    // first we will gonna create a divide function 
    public static void main(String[] args) {
        int arr[] = { 88 , 12 , 32 , 48 , 69 , 90 , 28 };
        divide(arr, 0, arr.length-1);
        for( int i = 0 ; i < arr.length ; i++ ) System.out.print(arr[i] + "\t");
    }
    // here we will pass parameter like array , first = 0 , and last = arr.length-1
    public static void divide( int arr[] , int first , int last ) {
        //base condition is given
        if( first >= last ) return;
        // we will create mid for dividing an array from mid
        int mid = first + ( last - first ) / 2;
        //first arrat from first to mid
        divide(arr, first, mid);
        //second array from mid+1 to last
        divide(arr, mid+1, last);
        // we will call a sort/conquer function 
        sort(arr, mid, first, last);
    }
    //same parameters are given but we will also gonna pass mid here
    public static void sort(int arr[] , int mid , int first , int last) {
        //create an new array and the length will be last - first + 1
        //eg last = 2 first = 0, { 2 - 0 + 1 = 3 } so it will be half the length of original array
        int merged[] = new int[ last - first + 1 ];
        //create index 1 which will be considered as first
        int i1 = first;
        // create index 2 which will be considered as mid+1 
        int i2 = mid+1;
        // taking one more index which will be considere as index of new array
        int index = 0;

        // here will loop it will run till condition is true
        while ( i1 <= mid && i2 <= last ) {
            // we will check if value of i1 <= value of i2 in divided array
            //like array is of 2, 9, 8, 7, 3, 0
            // it is divided in 2,9,8    7,3,0
            // so it will check "2" <= "7"

            if( arr[i1] <= arr[i2] ){
                //if condition is true then value of i1 will be stored at index of new array
                merged[index++] = arr[i1++]; 
            }
            else{
                // vice versa for else case 
                merged[index++] = arr[i2++]; 
            }
        }
        
        // disclaimer :- here after completing above loop the elements that are left will either be from first array or second array 
        // so only one loop wll gonna work which is given below

        // if any element is left in first divided array
        while ( i1 <= mid ) {
            // it will add it if less than mid 
            merged[index++] = arr[i1++];
        }
        // if any element is left in second divided array
        while ( i2 <= last ) {
            // it will add it if less than last 
            merged[index++] = arr[i2++];
        }

        // here is the final stage we will gonna shift the element of merged array to the main array
        for( int i = 0 , j = first ; j <= last ; i++ , j++ ){
            arr[j] = merged[i];
        }

    }

}
