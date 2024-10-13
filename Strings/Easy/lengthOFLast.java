public class lengthOFLast {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String arr[] = s.split(" ");
        // System.out.println(s);
        return arr[arr.length-1].length();
    }
    public static void main(String[] args) {
        lengthOFLast obj = new lengthOFLast();
        String s = " hello world ";
        int result = obj.lengthOfLastWord(s);
        System.out.println(result);
    }
}
