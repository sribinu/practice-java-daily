package combined;

/**
 * ----------------------------------------------------------
 * Program No   : COM4
 * Question     : Demonstrate use of instance block for initializing non-static variables.
 * Title        : Lawyer.java
 * Author       : Sribinu P
 * Created On   : 12-04-2026
 * Topic        : combined (instance variable)
 * Difficulty   : Easy
 * Description  : Demonstrate use of instance block for initializing non-static variables.
 * ----------------------------------------------------------
 */

public class Lawyer {

    String name;
    int age;

    {
        name = "John";
        age = 18;
        System.out.println("Instance block executed");
    }

    public Lawyer() {
        System.out.println("Constructor executed");
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {
        // Program COM4: Lawyer
        // Instance block = runs before constructor for every object
        Lawyer lawyer = new Lawyer();
        System.out.println("\nLawyer Details: ");
        lawyer.display();
    }
}

/* Output:
    Instance block executed
    Constructor executed

    Lawyer Details:
    Name : John
    Age  : 18
 */