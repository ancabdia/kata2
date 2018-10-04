
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
        String[] data = {"luis", "miguel", "andres", "luis", "luis", "andres"};
        
        Histogram histo = new Histogram(data);
        
        Map<String, Integer> histogr = histo.getHistogram();
        
        for (String i : histogr.keySet()) {
            System.out.println(i + " ==> " + histogr.get(i));
        }          
    }
    
}
