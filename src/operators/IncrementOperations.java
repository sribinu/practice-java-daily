package operators;

/**
 * ----------------------------------------------------------
 * Program No   : O4
 * Question     : Demonstrate difference between pre-increment and post-increment.
 * Title        : IncrementOperations.java
 * Author       : Sribinu P
 * Created On   : 21-11-2025
 * Topic        : Increment/Decrement
 * Difficulty   : Very Easy
 * Description  : Increment Operators usage
 * ----------------------------------------------------------
 */

public class IncrementOperations {

    public static void main(String[] args) {
        // Program O4: IncrementOperations
        int x = 5;

        System.out.println("Initial value of x = " + x);

        // Post-increment
        int post = x++;     // value is used first, then increment happens
        System.out.println("\nPost-Increment (post = x++):");
        System.out.println("Returned value : " + post);
        System.out.println("Value of x now: " + x);

        // Reset x
        x = 5;

        // Pre-increment
        int pre = ++x;      // value is incremented first, then used
        System.out.println("\nPre-Increment (pre = ++x):");
        System.out.println("Returned value : " + pre);
        System.out.println("Value of x now: " + x);
    }
}

/* Output:
    Initial value of x = 5

    Post-Increment (post = x++):
    Returned value : 5
    Value of x now: 6

    Pre-Increment (pre = ++x):
    Returned value : 6
    Value of x now: 6
 */