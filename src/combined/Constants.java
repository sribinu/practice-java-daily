package combined;

/**
 * ----------------------------------------------------------
 * Program No   : COM1
 * Question     : Create a class with a static final variable (constant) and display it using the class name.
 * Title        : Constants.java
 * Author       : Sribinu P
 * Created On   : 05-04-2026
 * Topic        : final (constant)
 * Difficulty   : Easy
 * Description  : Create a class with a static final variable (constant) and display it using the class name.
 * ----------------------------------------------------------
 */

public class Constants {

    static final double PI = 3.14159;

    public static void main(String[] args) {
        // Program COM1: Constants
        // static final = constant → access using ClassName.variable
        System.out.println("Value of PI: " + Constants.PI);
    }
}

/* Output:
    Value of PI: 3.14159
 */