import java.util.*;
public class validAnagram {
    public boolean isAnagram( String s1, String s2 ) {
        if( s1.length() != s2.length() ) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        if( Arrays.equals(arr1, arr2) ){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        validAnagram obj = new validAnagram();
        String s1 = "listen";
        String s2 = "silent";
        Boolean result = obj.isAnagram(s1, s2);
        System.out.println(result);
    }
}
