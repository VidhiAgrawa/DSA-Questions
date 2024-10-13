import java.util.*;
public class removeAdjacentStr {
    public static void main(String[] args) {
        String str = "aabbddcg";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if( sb.length() > 0 && sb.charAt(sb.length() - 1) == c ){
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
