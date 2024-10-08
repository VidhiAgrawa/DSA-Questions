public class validParenthisis {
    public boolean isValid(String s) {
        if( s.isEmpty() ) return true;
        String temp = s.replace("()", "").replace("{}", "").replace("[]", "");  
        System.out.println(s);      
        System.out.println(temp);      
        if( temp.equals(s) ) return false;
        return isValid(temp);
    }
    public static void main(String[] args) {
        validParenthisis obj = new validParenthisis();
        System.out.println(obj.isValid("([''])"));
    }
    
}
