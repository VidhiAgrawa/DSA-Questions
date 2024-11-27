public class Quick_sort {
    public static void main(String[] args) {

        //create an unsorted array or take input from user 
        int arr[] = {  61, 5, 59, 23, 6, 0 };
        
        //create a function of quick sort
        Quick_Sort( arr, 0, arr.length - 1 );
    }
    
    //in the given function we will pass parameters of array left = 0 and right = arr.length - 1
    static void Quick_Sort(int arr[], int left, int right){

        // we will write base condition for returning 
        if( left >= right ) return;
        
        // we will take pivot in which we will create a partition funtion for parting an array in 2 parts 
        int pivot = partition( arr, left, right );

        //then we will call the function recursively
        Quick_Sort(arr, pivot + 1, right);
        Quick_Sort(arr, left, pivot - 1);
    }

    //here we will pass parameter like arr , low , high
    static int partition( int arr[], int low, int high ){

        // we will take pivot as the last index or last value
        int pivot = arr[high];
        
        //then we will take index which will have the value of low
        int index = low;
        
        //the we will run a for loop from low to high
        for (int i = low; i < high; i++) {
            // int arr[] = { 1, 5, 9, 3, 6, 0, -1 };

            //the we will check that 
            if( arr[i] < pivot ){

                // then we will swap between indexes 
                //if arr[i] < pivot 
                // we will insert small elements at start
                int temp = arr[index]; 
                arr[index] = arr[i];
                arr[i] = temp;

                //then index will be incremented
                index++;
            }
        }

        //otherwise we will swap pivot to its right place
        int temp = arr[index];
        arr[index] = arr[high];
        arr[high] = temp;

        // displaying of sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        
        //returning index
        return index;
    }
}
