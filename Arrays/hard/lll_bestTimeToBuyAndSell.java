// Note:- not completed yet 

public class lll_bestTimeToBuyAndSell {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        profit(arr);
    }
    public static int[] profit(int arr[]) {
        int maxProfit = 0;
        int i = 0;
        int count = 0;
        int[] newArray = new int[arr.length];
        while (i < arr.length - 1) {
            if( arr[i] < arr[i+1] ){
                int max = arr[i+1] - arr[i];
                newArray[count++] = max;
                // System.out.println("max:- " + max);

            }
            i++;
        }
        int profitArray[] = new int[count] ;
        for (int j = 0; j < profitArray.length; j++) {
            profitArray[j] = newArray[j];
            System.out.print("array :- " + profitArray[j] + "\t");
        }
        
        return profitArray;
        
    }
    
}
