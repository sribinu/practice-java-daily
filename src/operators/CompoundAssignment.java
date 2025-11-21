package operators;

/**
 * ----------------------------------------------------------
 * Program No   : O8
 * Question     : Show how +=, -=, *=, /= operators work.
 * Title        : CompoundAssignment.java
 * Author       : Sribinu P
 * Created On   : 21-11-2025
 * Topic        : Compound Assignment
 * Difficulty   : Very Easy
 * Description  : Program to demonstrate compound assignment operators
 * ----------------------------------------------------------
 */

public class CompoundAssignment {

    public static void main(String[] args) {
        // Program O8: CompoundAssignment
        int a = 10;
        int b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        a += b;  // equivalent to a = a + b;
        System.out.println("After a += b ; a = " + a);

        a -= b;  // equivalent to a = a - b;
        System.out.println("After a -= b ; a = " + a);

        a *= b;  // equivalent to a = a * b;
        System.out.println("After a *= b ; a = " + a);

        a /= b;  // equivalent to a = a / b;
        System.out.println("After a /= b ; a = " + a);
    }
}

/* Output:
    Initial values: a = 10, b = 5
    After a += b ; a = 15
    After a -= b ; a = 10
    After a *= b ; a = 50
    After a /= b ; a = 10
 */