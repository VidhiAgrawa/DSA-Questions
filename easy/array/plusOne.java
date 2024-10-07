public class plusOne {
    public static int[] plus() {
        int digits[] = { 9 };
        if( digits[ digits.length-1 ] != 9 ){
            digits[digits.length - 1] += 1;
        }   
        else{
            int nums[] = new int[digits.length+1];
            int carry = 1;
            for (int i = digits.length - 1; i >= 0 ; i--) {
                if( digits[i] + carry > 9 ){
                    int after = digits[i] + 1;
                    String str = Integer.toString(after);
                    digits[i] = Character.getNumericValue(str.charAt(1));
                    carry = Character.getNumericValue(str.charAt(0));
                }
                else{
                    digits[i] += carry;
                    carry = 0;                    
                }
                nums[i] = digits[i];
            }
            if( carry == 1 ){
                int newNums[] = new int[digits.length+1];
                newNums[0] = 1;
                nums = newNums;
                
            }
            for (int i : nums) {
                System.out.println(i);
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        plusOne obj = new plusOne();
        obj.plus();
    }
}
