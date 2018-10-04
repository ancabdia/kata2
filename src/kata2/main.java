
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] data = {1,2,5,4,9,7,6,4,6,3,8,9};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i]) == true)
            histogram.put(data[i], histogram.get(data[i])+1);
            else histogram.put(data[i], 1);
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+ "==>" + histogram.get(data[i]));
        }
    }
    
}
