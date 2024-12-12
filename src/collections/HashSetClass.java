package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

    //HashSet Declaration
    HashSet<String> namesSet = new HashSet<String>();


    public void useHashSet(){

        //Add element to the HashSet
        namesSet.add("Lisa");
        namesSet.add("Monica");
        namesSet.add("Tracy");
        namesSet.add("Mary");
        namesSet.add("Shawn");
        System.out.println("Original HashSet - nameSet: " + namesSet);

        //Add duplicate elements
        namesSet.add("Lisa");
        namesSet.add("Monica");

        System.out.println("Original HashSet - nameSet: " + namesSet);

        namesSet.add(null);
        namesSet.add(null);
        System.out.println("Original HashSet - nameSet: " + namesSet);

        //Display HashSet elements
        Iterator<String> stringIterator = namesSet.iterator();

        //Accessing elements
        while(stringIterator.hasNext()){
            System.out.print(stringIterator.next());
            System.out.print(", ");
        }
        System.out.println();

        //clone returns an Object type    //cast here
        HashSet<String> clonedNamesSet = (HashSet<String>) namesSet.clone();
        System.out.println("Cloned HashSet: " + clonedNamesSet);


        //Union - get the union of two sets x and y
        HashSet<String> animalsSet = new HashSet<String>();
        animalsSet.add("Lion");
        animalsSet.add("Tiger");
        animalsSet.add("Elephant");
        animalsSet.add("Mary");
        animalsSet.add("Lisa");
        animalsSet.add(null);
        System.out.println("New HashSet - animalsSet: " + animalsSet);

        //Compute the union of namesSet and animalsSet
        HashSet<String> unionSet = new HashSet<>(animalsSet);
        unionSet.addAll(namesSet);
        //Display unionSet
        System.out.println("Union of namesSet and animalsSet: " + unionSet);

        //Retain All - retains only element in the namesSet that are in the animalsSet
        namesSet.retainAll(animalsSet);
        System.out.println("Element retained in namesSet after retainAll: " + namesSet);

        //Size of HashSet
        System.out.println("Size of HashSet namesSet : " + namesSet.size());

    }
}
