package utils;

import model.Employee;

import java.util.LinkedList;

public class EmployeeLinkedList {
    public void useLinkedList() {

        // Create a LinkedList of Employee objects
        LinkedList<Employee> employeeList = new LinkedList<>();

        // Add employees to the list
        addEmployee(employeeList, new Employee(1, "Alice"));
        addEmployee(employeeList, new Employee(2, "Bob"));
        addEmployee(employeeList, new Employee(3, "Charlie"));

        // Display all employees
        displayEmployees(employeeList);

        // Add an employee at the beginning
        employeeList.addFirst(new Employee(4, "Diana"));
        System.out.println("\nAfter adding Diana at the beginning:");
        displayEmployees(employeeList);

        // Add an employee at the end
        employeeList.addLast(new Employee(5, "Ethan"));
        System.out.println("\nAfter adding Ethan at the end:");
        displayEmployees(employeeList);

        // Remove the first employee
        Employee removedFirst = employeeList.removeFirst();
        System.out.println("\nRemoved the first employee: " + removedFirst);

        // Remove the last employee
        Employee removedLast = employeeList.removeLast();
        System.out.println("\nRemoved the last employee: " + removedLast);

        // Display employees after removals
        System.out.println("\nFinal Employee List:");
        displayEmployees(employeeList);
    }

    // Method to add an employee to the LinkedList
    public static void addEmployee(LinkedList<Employee> list, Employee employee) {
        list.add(employee); // Add to the end by default
        System.out.println("Added: " + employee);
    }

    // Method to display all employees in the LinkedList
    public static void displayEmployees(LinkedList<Employee> list) {
        System.out.println("Employee List:");
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }

}


