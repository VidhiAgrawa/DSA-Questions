public class StringPalindrome {
    
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder str = new StringBuilder(s);
        String reversed = str.reverse().toString();
        if( s.equals(reversed) ) return true;
        return false;
        
    }
    public static void main(String[] args) {
        StringPalindrome obj = new StringPalindrome();
        obj.isPalindrome("A man, a plan, a canal: Panama");
    }
    
}
