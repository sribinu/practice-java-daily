package operators;

/**
 * ----------------------------------------------------------
 * Program No   : O2
 * Question     : Compare two numbers using relational operators and print results.
 * Title        : CompareNumbers.java
 * Author       : Sribinu P
 * Created On   : 21-11-2025
 * Topic        : Relational Operations
 * Difficulty   : Very Easy
 * Description  : Comparing Numbers
 * ----------------------------------------------------------
 */

public class CompareNumbers {

    public static void main(String[] args) {
        // Program O2: CompareNumbers
        int a = 10;
        int b = 20;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("--------------------------------");

        System.out.println("a == b  : " + (a == b));   // equal to
        System.out.println("a != b  : " + (a != b));   // not equal to
        System.out.println("a > b   : " + (a > b));    // greater than
        System.out.println("a < b   : " + (a < b));    // less than
        System.out.println("a >= b  : " + (a >= b));   // greater than or equal
        System.out.println("a <= b  : " + (a <= b));   // less than or equal
    }
}

/* Output:
    a = 10, b = 20
    --------------------------------
    a == b  : false
    a != b  : true
    a > b   : false
    a < b   : true
    a >= b  : false
    a <= b  : true
 */