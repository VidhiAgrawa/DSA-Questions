public class Best_time_to_buy_and_Sell {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 9, 6, 1 };
        int min = minimum(arr);
        // System.out.println(min);
        int maxPro = maxProfit(arr, min);
        System.out.println(maxPro);
        
    }
    public static int minimum(int arr[]) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < arr[min] ){
                min = i;
                System.out.println(min);
            }
        }
        return min;
    }
    public static int maxProfit(int arr[], int min) {
        if( arr == null || arr.length == 0 ) return 0;
        int max = 0;
        for (int i = min+1; i < arr.length; i++) {
            int profit = arr[i] - arr[min];
            if( profit > max ){
                max = profit;
            }
        
        }
        return max;
    }
}
