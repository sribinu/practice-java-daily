package control_statements;

/**
 * ----------------------------------------------------------
 * Program No   : CS5
 * Question     : Input marks and print grade (A, B, C, etc.) using if-else if.
 * Title        : GradeCalculator.java
 * Author       : Sribinu P
 * Created On   : 22-11-2025
 * Topic        : Grade Calculator
 * Difficulty   : Very Easy
 * Description  : This program takes student marks as input and prints the grade (A, B, C, D, or F).
 * ----------------------------------------------------------
 */

public class GradeCalculator {

    public static void main(String[] args) {
        // Program CS5: GradeCalculator
        // Uses if–else if ladder to compare marks against grade ranges.

        int marks = 88;

        if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 80) {
            System.out.println("Grade: B");
        }
        else if (marks >= 70) {
            System.out.println("Grade: C");
        }
        else if (marks >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }
}

/* Output:
    Grade: B
 */