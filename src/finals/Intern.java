package finals;

/**
 * ----------------------------------------------------------
 * Program No   : FIN2
 * Question     : Write a program to initialize a blank final variable inside a constructor.
 * Title        : Intern.java
 * Author       : Sribinu P
 * Created On   : 02-04-2026
 * Topic        : final (initialization)
 * Difficulty   : Easy
 * Description  : Write a program to initialize a blank final variable inside a constructor.
 * ----------------------------------------------------------
 */

public class Intern {

    final int id;
    String name;

    public Intern(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        // Program FIN2: Intern
        // Blank final = must be initialized in constructor (only once)
        Intern intern = new Intern(101, "ADAM");

        intern.display();

//        intern.id = 200; // CTE: Cannot assign a value to final variable 'id'
    }
}

/* Output:
    ID   : 101
    Name : ADAM
 */