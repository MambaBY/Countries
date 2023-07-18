import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Contries {

    static Map<String, String> countryMap = new HashMap<>(){
        {
            put("Belarus", "Minsk");
            put("Poland", "Warsaw");
            put("Italy", "Rome");
            put("Germany", "Berlin");
        }
    };


    /*
     * Output Keys to the console
     */
    public void printAllKeys(){
        System.out.println("All keys: " + countryMap.keySet());
        Iterator<String> iterator = countryMap.keySet().iterator();
        System.out.print("Keys printed by Iterator: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }


    /*
     * Output Values to the console
     */
    public void printAllValues(){
        System.out.println("All values: " + countryMap.values());
        Iterator<String> iterator = countryMap.values().iterator();
        System.out.print("Values printed by Iterator: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }


    /*
     * Output Callection to the console
     */
    public void printCollectionEntries(){
        System.out.println("All collection: " + countryMap.entrySet());
        Iterator<Map.Entry<String, String>> iterator = countryMap.entrySet().iterator();
        System.out.print("Collection printed by Iterator: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }


    /*
     * Output pairs 'Key-Value' to console
     */
    public void printCollectionEntriesKeyValue(){
        Iterator<Map.Entry<String, String>> iterator = countryMap.entrySet().iterator();
        System.out.println("Collection printed by Iterator: ");
        while (iterator.hasNext()){
            Map.Entry<String ,String> entry = iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
    }

}
