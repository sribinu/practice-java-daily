package constructor;

/**
 * ----------------------------------------------------------
 * Program No   : CON4
 * Question     : Simulate copy constructor behavior in Java by copying one object’s values into another.
 * Title        : Intern.java
 * Author       : Sribinu P
 * Created On   : 24-03-2026
 * Topic        : Constructor (Copy Constructor)
 * Difficulty   : Easy
 * Description  : This program demonstrates how to simulate a copy constructor in Java by creating a constructor
 *                that accepts another object of the same class and copies its values into a new object.
 * ----------------------------------------------------------
 */

public class Intern {
    String name;
    int id;
    double salary;

    public Intern(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Copy Constructor
    public Intern(Intern intern) {
        this.name = intern.name;
        this.id = intern.id;
        this.salary = intern.salary;
    }

    public void display() {
        System.out.println("Name   : " + name);
        System.out.println("Id     : " + id);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        // Program CON4: Intern
        // Copy constructor = create new object by copying another object’s values
        Intern intern1 = new Intern("Adam", 101, 10000.0);
        Intern intern2 = new Intern(intern1);

        System.out.println("Original Intern: ");
        intern1.display();

        System.out.println("\nCopied Intern: ");
        intern2.display();
    }
}

/* Output:
    Original Intern:
    Name   : Adam
    Id     : 101
    Salary : 10000.0

    Copied Intern:
    Name   : Adam
    Id     : 101
    Salary : 10000.0
 */