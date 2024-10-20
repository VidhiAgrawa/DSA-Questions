public class ll_BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int arr[] = { 7, 5, 1, 2, 6, 3 };
        int profit = maxProfit(arr);
        System.out.println(profit);
        
    }
    public static int maxProfit( int arr[] ) {
        int maxPro = 0;
        int i = 0;
        while ( i < arr.length - 1 ) {
            if( arr[i] < arr[i+1] ){
                    int max = arr[i+1] - arr[i];
                    maxPro += max;
                    // System.out.println(max);
            }
            i++;
        }
        return maxPro;
    }
}
