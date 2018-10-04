
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
        int[] data = {1,1,1,1,0,0,3,3,5};
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i], histogram.containsKey(data[i]) ? histogram.get(data[i]) + 1 : 1);
            
        }
        
        for (Integer i : histogram.keySet()) {
            System.out.println(i + "==>" + histogram.get(i));
        }        
    }
    
}
