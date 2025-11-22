package control_statements;

/**
 * ----------------------------------------------------------
 * Program No   : CS6
 * Question     : Check if a year is a leap year using conditional statements.
 * Title        : LeapYearCheck.java
 * Author       : Sribinu P
 * Created On   : 22-11-2025
 * Topic        : Leap Year Check
 * Difficulty   : Easy
 * Description  : This program checks whether a given year is a leap year.
 * ----------------------------------------------------------
 */

public class LeapYearCheck {

    public static void main(String[] args) {
        // Program CS6: LeapYearCheck
        // Uses divisible-by-4, 100, and 400 rules to determine leap year status.
        int year = 2024;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

/* Output:
    2024 is a leap year.

   Logic:
    A year is a leap year if it is divisible by 400, OR (divisible by 4 but NOT divisible by 100).
   Reason:
    This rule exists because:
        The Earth takes 365.2425 days to orbit the Sun (not exactly 365.25).
        We add a leap day every 4 years to fix the extra time → but this slightly over-corrects.
        To fix the over-correction, century years (100, 200, 300…) are skipped as leap years.
        But skipping all century years would under-correct the calendar, so every 400th year is kept as a leap year.
        This keeps the calendar perfectly aligned with the Earth’s orbit over long periods.
 */