package hashMap;
import java.util.*;

public class rommanTOinteger {
    public int ro_int(String s) {
        HashMap < Character, Integer > map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;//50
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int value = map.get(s.charAt(i)); //1
                int next = 0;
                if( i + 1 < n ) next = map.get(s.charAt( i + 1 ));
                if( value < next ){
                    total -= value;
                }
                else {
                    total += value ;//50+2=52 
                }
            

            
        }
        return total;

    }
    
}
