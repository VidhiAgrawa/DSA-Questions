public class reverseString {
    public String r(String s, int k) {
        // StringBuilder sb = new StringBuilder(s);
        if( s.length() < k ){
            return new StringBuilder(s).reverse().toString();
            // System.out.println(s);
        }
        else if( s.length() < 2 * k ){
            return new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k);
        }
        else {
            return new StringBuilder(s.substring(0, k)).reverse().toString() +
                   s.substring(k, 2 * k) + r(s.substring(2 * k), k);
        }
    }
    public static void main(String[] args) {
        String s = "abdsjk";
        int k = 2;
        
    }
}
