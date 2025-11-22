package control_statements;

/**
 * ----------------------------------------------------------
 * Program No   : CS3
 * Question     : Find the largest among three numbers using nested if.
 * Title        : LargestOf3NestedIf.java
 * Author       : Sribinu P
 * Created On   : 22-11-2025
 * Topic        : Largest of three
 * Difficulty   : Very Easy
 * Description  : This program finds the largest among three numbers using nested if statements.
 * ----------------------------------------------------------
 */

public class LargestOf3NestedIf {

    public static void main(String[] args) {
        // Program CS3: LargestOf3NestedIf
        // Compares numbers step-by-step using nested conditions to determine the largest.
        int a = 25, b = 40, c = 12;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the largest");
            } else {
                System.out.println(c + " is the largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is the largest");
            } else {
                System.out.println(c + " is the largest");
            }
        }
    }
}

/* Output:
    40 is the largest
 */