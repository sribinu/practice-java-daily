package constructor;

/**
 * ----------------------------------------------------------
 * Program No   : CON8
 * Question     : Explain and demonstrate with code why constructors cannot be overridden.
 * Title        : Child3.java
 * Author       : Sribinu P
 * Created On   : 09-04-2026
 * Topic        : constructor (overriding)
 * Difficulty   : Easy
 * Description  : Explain and demonstrate with code why constructors cannot be overridden.
 * ----------------------------------------------------------
 */

class Parent3 {

    public Parent3() {
        System.out.println("Parent constructor called");
    }

    public void show() {
        System.out.println("Parent show() method");
    }
}

public class Child3 extends Parent3 {

    public Child3() {
        System.out.println("Child constructor called");
    }

    @Override
    public void show() {
        System.out.println("Child show() method");
    }

    public static void main(String[] args) {
        // Program CON8: Child3
        // Constructors are not inherited → so they cannot be overridden
        Child3 object = new Child3();
        object.show();
    }
}

/* Output:
    Parent constructor called
    Child constructor called
    Child show() method
 */