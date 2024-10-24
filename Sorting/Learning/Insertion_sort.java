public class Insertion_sort {
    static void insertion( int arr[] ){
        // int arr[] = { 12, 10, 43, 76, 9, 5 };
        // create a for loop from ist index = 10 value to the length of array and then increament the index
        for (int i = 1; i < arr.length; i++) { 
            // 2nd loop it will run from ith index to 0th index and then decreament of j it means that 
            for (int j = i; j > 0; j--) { 
                // it will compare the jth index from the previous index 
                if( arr[j] < arr[j-1] ){ 
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        
        // dry run of the given code   
        //  array = { 10, 12, 43, 76, 9, 5 }
        //  array = { 10, 12, 43, 9, 76, 5 }
        //  array = { 10, 12, 9, 43, 76, 5 }
        //  array = { 10, 9, 12, 43, 76, 5 }
        //  array = { 9, 10, 12, 43, 76, 5 }
        //  array = { 9, 10, 12, 43, 5, 76 }
        //  array = { 9, 10, 12, 5, 43, 76 }
        //  array = { 9, 10, 5, 12, 43, 76 }
        //  array = { 9, 5, 10, 12, 43, 76 }
        //  array = { 5, 9, 10, 12, 43, 76 }
    }
    public static void main(String[] args) {
        int arr[] = { 12, 10, 43, 76, 9, 5 };
        insertion(arr);
    }
}

        // eg :- if array = { 5, 2, 0, -1 }
        /*
         * it means that it will check j = i(i=1) from j-1(1-1 = 0th index)
         * if j < j-1 then it will swap
         * first will check from 2 < 5 the swap
         * so array { 2, 5, 0, -1}
         * then will consider {2, 5} as sorted array then
         * it will compare from 0 < 5 if less than swap
         * array = { 2, 0, 5, -1 } then 0<2 swap
         * array = { 0, 2, 5, -1 } then same process
         * final array = { -1, 0, 2, 5 }
         */