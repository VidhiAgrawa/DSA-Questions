import java.util.Scanner;

public class SearchInRotatedArrsay {
    public static void main(String[] args) {
        SearchInRotatedArrsay obj = new SearchInRotatedArrsay();
        
        int nums[] = { 4,5,6,7,0,1,2 };
        // int left = 0;
        // int right = nums.length - 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the target:- ");
        int target = sc.nextInt();
        int res = obj.search(nums, target);
        System.out.println("index:- " + res);
    
    }
    public int sort(int nums[]) {
        int lower = 0;
        int upper = nums.length - 1;
        while( lower < upper ){
            int mid = lower + ( upper - lower ) / 2;
            if( nums[mid] > nums[upper] ){
                lower = mid + 1;
            }
            else{
                upper = mid;
            }
        }
        return lower;
    }
    public int Binary(int target, int left, int right, int[] nums) {
        int mid = left + ( right - left ) / 2;
        if( left > right ) {
            return -1;
        }
        if( nums[mid] == target ){
            // System.out.println( "Found at index:- " + mid );
            return mid;
        }
        else if ( nums[mid] > target ){
            right = mid - 1;
            return Binary(target, left, right, nums);
        }
        else{
            left = mid + 1;
            return Binary(target, left, right, nums);
        }
        // return 0;
    }
    public int search(int nums[] , int target) {
        int pivot = sort(nums);
        int result = Binary(target, 0, pivot - 1, nums);
        if( result == -1 ){
            return Binary(target, pivot, nums.length - 1, nums);
        }
        return result;
    }

}
