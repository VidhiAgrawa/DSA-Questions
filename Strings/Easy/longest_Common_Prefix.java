public class longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        String st = longest_Common_Prefix(strs);
        // System.out.println(st);
    }
    
    public static String longest_Common_Prefix(String[] strs) {
        // finding minimum length of String
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());    
        }
        // now searching for common preffix
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char word = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if( strs[j].charAt(i) != word ){
                    return prefix.toString();        
                }   
            }
            prefix.append(word);    
        }
        return prefix.toString();        
    }
}
