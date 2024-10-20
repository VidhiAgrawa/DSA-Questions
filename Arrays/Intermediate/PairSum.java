import java.util.Vector;

public class PairSum {
    public static void main(String[] args) {
        // Vector<Integer> arr = new Vector<>();
        // arr.add(2);
        // arr.add(7);
        // arr.add(11);
        // arr.add(15);
        int arr[] = { 2, 7, 11, 15 };
        int target = 26;
        PairSum(arr, target);
    }

    public static void PairSum( int arr[], int target ) {
        int i = 0, j = arr.length - 1;
        while( i < j ){
            int PairSum = arr[i] + arr[j];
            if ( PairSum == target ){
                System.out.println("found :- " + arr[i] + "," + arr[j]);
                return;
            }
            else if( PairSum < target ){
                i++;
            }
            else{
                j--;
            }
        }
    }
    // public static void PairSum ( Vector<Integer> arr, int target ){

    //     int i = 0;
    //     int j = arr.size() - 1;
    //     Vector<Integer> answer;

    //     while ( i < j ) {
    //         int PairSum = arr.get(i) + arr.get(j);
            
    //         if ( PairSum == target ){
    //             System.out.println("found :- " + arr.get(i) + "," + arr.get(j));
    //             return;
    //         }
    //         else if( PairSum < target ){
    //             i++;
    //         }
    //         else{
    //             j++;
    //         }
    //     }

    // }
        
}

