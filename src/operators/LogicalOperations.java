package operators;

/**
 * ----------------------------------------------------------
 * Program No   : O3
 * Question     : Demonstrate logical operators (&&, ||, !) with clear output.
 * Title        : LogicalOperations.java
 * Author       : Sribinu P
 * Created On   : 21-11-2025
 * Topic        : Logical Operations
 * Difficulty   : Very Easy
 * Description  : Logical Operators usage
 * ----------------------------------------------------------
 */

public class LogicalOperations {

    public static void main(String[] args) {
        // Program O3: LogicalOperations
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("--------------------------------");

        // AND operator
        System.out.println("a && b : " + (a && b));   // true AND false → false

        // OR operator
        System.out.println("a || b : " + (a || b));   // true OR false → true

        // NOT operator
        System.out.println("!a     : " + (!a));       // NOT true → false
        System.out.println("!b     : " + (!b));       // NOT false → true
    }
}

/* Output:
    a = true, b = false
    --------------------------------
    a && b : false
    a || b : true
    !a     : false
    !b     : true
 */