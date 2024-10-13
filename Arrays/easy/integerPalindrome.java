class integerPalindrome {
    public boolean isPalindrome(int x) {
        if( x < 0 ){
            return false;
        }
        String str = Integer.toString(x);
        String reverse = "";
        for( int i = str.length() - 1; i >= 0; i-- ){
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        integerPalindrome obj = new integerPalindrome();
        obj.isPalindrome(121);
    }
}