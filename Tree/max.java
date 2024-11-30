public class max{
    public static int finddiff(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i] < min) min = arr[min];
        if(arr[i] > max) max = arr[max];
        }
        System.out.println("Min value :- " + min);
        System.out.println("Max value :- " + max);
        System.out.println("Difference Between Min and Max :- " + (max - min));
        return max - min;
    }
    public static void main(String args[]){
        int arr[]= {1,3,4,3,2,3,4,5,666};
        finddiff(arr);
    }
}