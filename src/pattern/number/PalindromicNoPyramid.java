package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT7
 * Question     : Print a numeric palindromic pyramid (e.g., 1 / 121 / 12321).
 * Title        : PalindromicNoPyramid.java
 * Author       : Sribinu P
 * Created On   : 11-12-2025
 * Topic        : Number Pattern (Palindromic Number Pyramid)
 * Difficulty   : Easy
 * Description  : Prints a centered palindromic number pyramid of height N.
 * ----------------------------------------------------------
 */

public class PalindromicNoPyramid {

    public static void main(String[] args) {
        // Program NPT7: PalindromicNoPyramid
        // Workflow: For each row i -> print (n-i) leading spaces, then 1..i and i-1..1.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            // leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter number of rows N: 5
        1
       121
      12321
     1234321
    123454321
 */