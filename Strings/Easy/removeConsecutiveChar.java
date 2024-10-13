import java.util.*;
public class removeConsecutiveChar {
    public static void main(String[] args) {
        String str = "aaabbbcccddd";
        removeConsecutiveChar obj = new removeConsecutiveChar();
        String result = obj.removeConsecuChar(str);
        System.out.println(result);
    }
    public static String removeConsecuChar(String str) {
        if(str.isEmpty()) return "";
        HashSet<Character> charHash = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()) {
            if(charHash.add(c)){
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}
