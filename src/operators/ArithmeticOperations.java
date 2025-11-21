package operators;

/**
 * ----------------------------------------------------------
 * Program No   : O1
 * Question     : Perform +, −, *, /, % operations on two integers.
 * Title        : ArithmeticOperations.java
 * Author       : Sribinu P
 * Created On   : 21-11-2025
 * Topic        : Arithmetic Operations
 * Difficulty   : Very Easy
 * Description  : Arithmetic Calculations
 * ----------------------------------------------------------
 */

public class ArithmeticOperations {

    public static void main(String[] args) {
        // Program O1: ArithmeticOperations
        int a = 20, b = 6;

        System.out.println("a = " + a + ", b = " + b);

        System.out.println("Addition (+)        : " + (a + b));
        System.out.println("Subtraction (−)     : " + (a - b));
        System.out.println("Multiplication (*)  : " + (a * b));
        System.out.println("Division (/)        : " + (a / b));
        System.out.println("Remainder (%)       : " + (a % b));
    }
}

/* Output:
    a = 20, b = 6
    Addition (+)        : 26
    Subtraction (−)     : 14
    Multiplication (*)  : 120
    Division (/)        : 3
    Remainder (%)       : 2
 */