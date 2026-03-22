package constructor;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CON2
 * Question     : Create a class Employee with a parameterized constructor to initialize name, id, and salary. Display the data.
 * Title        : Employee.java
 * Author       : Sribinu P
 * Created On   : 22-03-2026
 * Topic        : Constructor (Parameterized)
 * Difficulty   : Easy
 * Description  : Create a class Employee with a parameterized constructor to initialize: name, id, and salary. Then display the data.
 * ----------------------------------------------------------
 */

public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        // Program CON2: Employee
        // Parameterized constructor = pass values while creating object → assign using this
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scan.nextLine();

        System.out.print("Enter ID: ");
        int id = scan.nextInt();

        System.out.print("Enter salary: ");
        double salary = scan.nextDouble();

        Employee emp = new Employee(name, id, salary);

        emp.display();

        scan.close();
    }
}

/* Output:
    Enter name: Sribinu
    Enter ID: 101
    Enter salary: 300000
    Employee Details:
    Name   : Sribinu
    ID     : 101
    Salary : 300000.0
 */