public class maxAndmin{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 23, 4, 5, 66};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > num){
                num = arr[i];
            }
        }
        System.out.println("greater:- " + num);
        
    }
}