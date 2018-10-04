
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
        
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Integer i : histogr.keySet()) {
            System.out.println(i + "==>" + histogr.get(i));
        }        
    }
    
}
