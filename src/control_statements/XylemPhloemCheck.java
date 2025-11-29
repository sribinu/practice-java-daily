package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS27
 * Question     : Check whether a number is Xylem or Phloem.
 * Title        : XylemPhloemCheck.java
 * Author       : Sribinu P
 * Created On   : 29-11-2025
 * Topic        : Xylem / Phloem number
 * Difficulty   : Easy
 * Description  : This program calculates the sum of the extreme digits (first & last)   *                and the sum of the mean digits (between first and last) to determine   *                whether the number is Xylem (equal) or Phloem (not equal).
 * ----------------------------------------------------------
 */

public class XylemPhloemCheck {

    public static void main(String[] args) {
        // Program CS27: XylemPhloemCheck
        // Splits digits → adds extreme digits and mean digits → compares both sums.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isXylem(num)) {
            System.out.println(num + " is a Xylem number.");
        } else {
            System.out.println(num + " is a Phloem number.");
        }

        scan.close();
    }

    public static boolean isXylem(int num) {
        int temp = num;
        int last = num % 10, first = 0;
        int meanSum = 0, extremeSum = 0;

        temp /= 10;

        while (temp > 9) {
            meanSum += temp % 10;
            temp /= 10;
        }

        first = temp;
        extremeSum = first + last;

        return meanSum == extremeSum;
    }
}

/* Output 1:
    Enter a number: 1234
    1234 is a Xylem number.
   Output 2:
    Enter a number: 1210
    1210 is a Phloem number.
 */