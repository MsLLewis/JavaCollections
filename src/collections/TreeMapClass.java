package collections;

import java.util.TreeMap;

public class TreeMapClass {

    TreeMap<Integer, String> treeMapObj = new TreeMap<>();

    public void useTreeMap(){
        treeMapObj.put(1, "Per Scholas Atlanta, GA");
         treeMapObj.put(2, "Per Scholas Atlanta GA");
        treeMapObj.put(3, "Per Scholas Columbas, OH");
        treeMapObj.put(3, "Per Scholas  Florida, Orlando");
        treeMapObj.put(4, "Per Scholas Chicago, Ill");
        treeMapObj.put(5, "Per Scholas Chicago, Ill");
        treeMapObj.put(1, "Per Scholas New Jersey , NJ");
        //treeMapObj.put(null, "Per Scholas Dallas , TX");
        treeMapObj.put(6, null);
        treeMapObj.put(7, null);
        System.out.println(treeMapObj);



        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);
        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());
        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());
        // Using values()
        System.out.println("Values: " + numbers.values());

    }
}
