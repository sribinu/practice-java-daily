package control_statements;

/**
 * ----------------------------------------------------------
 * Program No   : CS2
 * Question     : Determine if a number is positive, negative, or zero.
 * Title        : CheckNumber.java
 * Author       : Sribinu P
 * Created On   : 22-11-2025
 * Topic        : Positive, Negative or Zero
 * Difficulty   : Very Easy
 * Description  : This program checks whether a number is even or odd using an if-else condition.
 * ----------------------------------------------------------
 */

public class CheckNumber {

    public static void main(String[] args) {
        // Program CS2: CheckNumber
        // Uses num % 2 to determine if remainder is 0 → even, else odd.
        int num = -10;

        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}

/* Output:
    -10 is Negative
 */