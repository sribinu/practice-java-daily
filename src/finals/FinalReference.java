package finals;

/**
 * ----------------------------------------------------------
 * Program No   : FIN5
 * Question     : Write a program to demonstrate that final reference variable cannot be reassigned but internal data can be changed.
 * Title        : FinalReference.java
 * Author       : Sribinu P
 * Created On   : 15-04-2026
 * Topic        : final (object reference)
 * Difficulty   : Easy
 * Description  : Write a program to demonstrate that final reference variable cannot be reassigned but internal data can be changed.
 * ----------------------------------------------------------
 */

public class FinalReference {

    String name;

    public FinalReference(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Program FIN5: FinalReference
        // Final reference = cannot change object reference, but can change object data
        final FinalReference finalReference = new FinalReference("James");
        finalReference.display();
        finalReference.name = "Clear";
        finalReference.display();

//        finalReference = new FinalReference("Mike"); // CTE: Cannot assign a value to final variable 'finalReference'
    }
}

/* Output:
    Name: James
    Name: Clear
 */