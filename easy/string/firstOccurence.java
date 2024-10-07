public class firstOccurence {
    public int str(String haystack, String needle ) {
              
        if( haystack.contains(needle) ){
            int r = haystack.indexOf(needle);
            System.out.println(r);
            return r;
        }
        return -1;
    }
    public static void main(String[] args) {
        firstOccurence obj = new firstOccurence();
        String haystack = "sadbutsad";
        String needle = "sad";
        obj.str(haystack, needle);
    }
}
