import java.util.TreeSet;

public class TreeSetClass {

    TreeSet<Integer> evenNumbers = new TreeSet<>();

    public void useTreeSet() {
        //Use add method to add elements
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);


        //Additional elements duplicates
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("After adding 2 and 4 to TreeSet: " + evenNumbers);

        try {
            evenNumbers.add(null);
            System.out.println("After adding null to TreeSet: " + evenNumbers);
        } catch (NullPointerException e) {
            System.out.println("Unable to add null elements to TreeSet: " + e.getMessage());
        }

        TreeSet<Integer> numbers = new TreeSet<>(evenNumbers);
        numbers.add(1);
      //  numbers.addAll(evenNumbers);
        System.out.println("New numbers TreeSet: " + numbers);

           /*
       TreeSet provides methods for easy navigation, including first(), last(), headSet(), tailSet(), etc.
       This is because TreeSet also implements the NavigableSet interface
        */

        //Get and displays the first element

        System.out.println("First element: " + numbers.first());

        //Get and display the last element
        System.out.println("First element: " + numbers.last());

        //Get and display the subset of elements less than 4
        System.out.println("Elements les than 4: " + numbers.headSet(4));

        //Get and display the subset of elements greater or equal to 2
        System.out.println("Elements greater than or equal to 2: " + numbers.tailSet(2));

    }
}
