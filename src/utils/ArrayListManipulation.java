package utils;

import model.Employee;

import java.util.*;

public class ArrayListManipulation {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        try {
            employees.add(employee);
            System.out.println("Added: " + employee);
        } catch (Exception e) {
            System.out.println("Failed to add employee: " + e.getMessage());
        }

        /*
             for(Employee emp : employees){
            System.out.println(emp);
        }
         */


    }

    public void displayEmployees() {
        System.out.println("\nEmployees List: ");
        try {
            Iterator<Employee> iterator = employees.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (Exception e) {
            System.out.println("Error displaying employees: " + e.getMessage());
        }
    }

    public void findEmployeeIndex(int id) {
        try {
            int index = -1;
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getId() == id) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                System.out.println("Employee with ID " + id + " is at index: " + index);
            } else {
                System.out.println("Employee with ID " + id + " not found.");
            }
        } catch (Exception e) {
            // Handle errors during index search
            System.out.println("Error finding employee index: " + e.getMessage());
        }
    }

    public void checkEmployeeExits(Employee employee) {
        try {
            boolean exists = employees.contains(employee);
            System.out.println("Employee " + employee + " exists: " + exists);
        } catch (Exception e) {
            // Handle errors during existence check
            System.out.println("Error checking employee existence: " + e.getMessage());

        }
    }

    public void removeEmployee(Employee employee) {
        try {

            boolean removed = employees.remove(employee);
            if (removed) {
                System.out.println("Removed: " + employee);
                for (Employee emp : employees) {
                    System.out.println(emp);
                }
            } else {
                System.out.println("Employee " + employee + " not found for removal.");
            }
        } catch (Exception e) {
            // Handle errors during removal
            System.out.println("Error removing employee: " + e.getMessage());
        }

    }

    public void checkEmployeeEligibiity(int id, int age, double gpa) throws Exception {
        Employee employee = findEmployeeById(id);
        //Eligibility criteria
        if (age < 18 || gpa < 2.0) {
            throw new ArithmeticException("Employee " + employee.getName() + " is not eligible for promotion. ");
        } else {
            System.out.println("Employee " + employee.getName() + " is eligible for promotion.");

        }
    }

    public Employee findEmployeeById(int id) throws Exception {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;  //returning employee if found
            }
        }
        throw new Exception("Employee with ID " + id + " not found.");
    }

    public void sortArrayList() {

        ArrayList<String> names = new ArrayList<>(List.of("Lisa", "Jim", "Bob"));

        System.out.println("Original List: " + names);
        Collections.sort(names);
        System.out.println("Sorted List: " + names);


    }


    public void demoArrayOOBExceptions() {
        try {
            // Example: ArrayIndexOutOfBoundsException
            System.out.println("\nAccessing an invalid index:");
            System.out.println(employees.get(5)); // Invalid index access
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index access
            System.out.println("Error: " + e.getMessage());
        }

    }


    public void demoNullException(){
        try {
            // Example: NullPointerException
            Employee nullEmployee = null; // Create a null object
            System.out.println("\nAccessing a null object:");
            System.out.println(nullEmployee.getName()); // Trigger NullPointerException
        } catch (NullPointerException e) {
            // Handle null object access
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void demoArithmeticException(){
        try {
            // Example: ArithmeticException
            System.out.println("\nDivision by zero:");
            int result = 100/ 0; // Trigger ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle invalid arithmetic operations
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void demoTryWithResources(){

        // Example: Try-With-Resources
        System.out.println("\nUsing Try-With-Resources:");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the ID of the employee to search for: ");
            int id = scanner.nextInt(); // Read employee ID from user
            Employee foundEmployee = findEmployeeById(id); // Search for employee
            System.out.println("Found Employee: " + foundEmployee); // Display found employee
        } catch (Exception e) {
            // Handle any errors during input or search
            System.out.println("Error: " + e.getMessage());
        }
    }

  public void useQueue(){
      Queue<String> waitingList = new LinkedList<>();

      //Customers joining the waiting list

      waitingList.add("Alice");
      waitingList.add("Jean");
      waitingList.add("Jane");

      //Serving customers in the order they arrived
      while(!waitingList.isEmpty()){
          System.out.println("Serving: " + waitingList.poll());
      }
  }




}



