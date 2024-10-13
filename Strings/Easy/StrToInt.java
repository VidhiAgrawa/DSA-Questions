public class StrToInt {
    public static int sToI() {
        String s = " abc420";
        s = s.trim();
        s = s.replaceAll("[a-zA-Z\\\\s]", " ");
        if( s.isEmpty() ) return 0;
        String neg = "^[+-]?\\d+";
        String remove = s.split("\\s+")[0];
        if( !remove.matches(neg) ) return 0;
        try {
            int num = Integer.parseInt(remove);
            return num;
        } catch (NumberFormatException e) {
            int result = Integer.MIN_VALUE;
            return result;
        } 
        
    }
    public static void main(String[] args) {
        StrToInt obj = new StrToInt();
        obj.sToI();
    }
}
