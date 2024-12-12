package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

    HashMap<Integer, String> mapObj = new HashMap<>();
    HashMap<String, Integer> mapObj2 = new HashMap<>();

    public void useHashMap(){
        mapObj2.put("Aa", 1);
        mapObj2.put("aa",2 );
        System.out.println("New HashMap mapObj2: " + mapObj2);


       mapObj.put(1, "Per Scholas Atlanta, GA" );
        mapObj.put(2, "Per Scholas New York, NY" );
        mapObj.put(3, "Per Scholas Columbas, OH");
        mapObj.put(3, "Per Scholas  Florida, Orlando");
        mapObj.put(4, "Per Scholas Chicago, Il");
        mapObj.put(5, "Per Scholas Chicago, Il");
        mapObj.put(1, "Per Scholas New Jersey , NJ");
        mapObj.put(null, "Per Scholas Dallas , TX");
        mapObj.put(null, "Per Scholas San Antonio , TX");
        System.out.println("New HashMap mapObj: " + mapObj);

        //Use get() method  , pass in key
        String value = mapObj.get(1);
        System.out.println("Value at index 1: " + value);

        System.out.println("Keys: " + mapObj.keySet());

        System.out.println("Keys: " + mapObj.values());

        System.out.println("Key/Value mappings: " + mapObj.entrySet());

        //Interate through the keys only
        System.out.println("Keys: ");
        for(Integer key : mapObj.keySet()){
            System.out.println(key);
        }
        //Interate through the values only
        System.out.println("Values: ");
        for(String avalue : mapObj.values()){
            System.out.println(avalue);
        }

        //interate through key/value entries
        System.out.println("\nEntries");
        for(Map.Entry<Integer, String> entry : mapObj.entrySet()){
            System.out.println(entry);
        }

    }
}
