class singleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for( int val : nums ){
            ans = ans ^ val;
        }
        return ans;
    }
    public static void main(String[] args){
        int nums[] = {2, 2, 1};
        singleNumber obj = new singleNumber();
        obj.singleNumber(nums);
    }
}