public class Best_time_to_buy_and_Sell {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 9, 6, 1 };
        int min = minimum(arr);
        System.out.println(min);
        int maxPro = maxProfit(arr, min);
        System.out.println(maxPro);
        
    }
    public static int minimum(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < min ){
                min = arr[i];
            }
        }
        return min;
    }
    public static int maxProfit(int arr[], int min) {
        int max = 0;
        int profit = 0;
        for (int i = min; i < arr.length; i++) {
            if( arr[i] > max ){
                profit = arr[i] - min;
                System.out.println("profit:- " + profit);
                if( profit > max ){
                    max = profit;
                    System.out.println("max:- " + max );
                }
            }
        }
        return profit;
    }
}
