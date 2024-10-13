import java.util.Arrays;

class arrayRankTransform{
    public int[] arrayRankTransform(int[] arr) {
        int nums[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        for( int j = 0; j < arr.length; j++ ){
            System.out.print(arr[j] + "\t");
        }

        int[] r = new int[nums.length];
        for (int i = 0; i < r.length; i++) {
            rank(arr, nums[i]);
        }
        return arr;
    }
    public int rank( int[] arr, int val ){
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == val ){
                return i+1;
            }
        }
        return 0;

    }
     
    public static void main(String[] args){
        arrayRankTransform solve = new arrayRankTransform();
        int arr[] = { 40, 10, 20, 30 };
        solve.arrayRankTransform(arr);
    }
}