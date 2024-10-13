public class reverseInteger {
    public static int in(String[] args) {
        int x = -123;
        String str = Integer.toString(Math.abs(x));
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        boolean neg = x < 0;
        try{
            int reverseInteger = Integer.parseInt(reverse.toString());
            if( neg ){
                reverseInteger = -reverseInteger;
            }
            return reverseInteger;
        }catch(NumberFormatException e){
            return 0;
        }
        // System.out.println(reverseInteger);
    }
}
