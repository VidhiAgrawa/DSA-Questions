public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int result = MajorityElement(arr);
        System.out.println(result);
    }
    public static int MajorityElement(int[] arr) {
        int frequency = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if( frequency == 0 ){
                ans = arr[i];
            }
            if( ans == arr[i] ){
                frequency++;
            }
            else{
                frequency--;
            }
        }
        return ans;
    }
}
