public class reverseString {
    public static void main(String[] args) {
        String s = "abdsjk";
        int k = 2;
        StringBuilder sb = new StringBuilder(s);
        if( sb.length() < k ){
            sb.reverse().toString();
            System.out.println(sb);
        }
        else if( sb.length() < 2 * k ){
            sb.substring(0, k).
        }
        else{

        }
    }
}
