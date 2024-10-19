public class kadanesAlgo {
    public int kda() {
        int arr[] = { 2, 4, 87, 3, 9 };
        int curr = 0;
        int maxS = Integer.MIN_VALUE;
        for (int each : arr) {
            curr += each;
            maxS = Math.max(curr, maxS);
            if( curr < 0 ){
                curr = 0;
            }
        }
        System.out.println(maxS);
        return maxS;
    }
    public static void main(String[] args) {
        kadanesAlgo obj = new kadanesAlgo();
        int result = obj.kda();
        System.out.println(result);
    }
}
