public class Best_time_to_buy_and_Sell {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 9, 6, 1 };
        int maxPro = maxProfit(arr);
        System.out.println(maxPro);
        
    }
    
    public static int maxProfit(int arr[]) {
        if( arr == null || arr.length == 0 ) return 0;
        int min = arr[0]; // 7 -> 3 -> 1
        int maxProfit = 0; // 2 -> 6
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < min ){
                min = arr[i];
            }
            else if( arr[i] - min > maxProfit ){ //5-3=2 -> 9-3=6 -> 6-3=3
                maxProfit = arr[i] - min;// 2
            }
        }
        return maxProfit;
    }
}
