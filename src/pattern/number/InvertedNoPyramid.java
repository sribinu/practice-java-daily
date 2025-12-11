package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT8
 * Question     : Print an inverted number pyramid starting from N.
 * Title        : InvertedNoPyramid.java
 * Author       : Sribinu P
 * Created On   : 11-12-2025
 * Topic        : Number Pattern (Inverted Number Pyramid)
 * Difficulty   : Easy
 * Description  : Prints an inverted palindromic number pyramid of height N.
 * ----------------------------------------------------------
 */

public class InvertedNoPyramid {

    public static void main(String[] args) {
        // Program NPT8: InvertedNoPyramid
        // Workflow: For each row i -> print (n-i) leading spaces, then 1..i and i-1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
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
    123454321
     1234321
      12321
       121
        1
 */