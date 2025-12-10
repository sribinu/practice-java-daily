package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT3
 * Question     : Print a centered pyramid using sequential numbers.
 * Title        : SequentialPyramid.java
 * Author       : Sribinu P
 * Created On   : 10-12-2025
 * Topic        : Number Pattern (Centered Sequential Pyramid)
 * Difficulty   : Easy
 * Description  : Prints a centered pyramid where each row prints odd number of increasing values:
*                 Row i contains numbers 1 to (2*i−1).
 * ----------------------------------------------------------
 */

public class SequentialPyramid {

    public static void main(String[] args) {
        // Program NPT3: SequentialPyramid
        // Print (n−i) spaces, then numbers from 1 to (2*i−1)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/* Output:
    Enter number of rows N: 5
            1
          1 2 3
        1 2 3 4 5
      1 2 3 4 5 6 7
    1 2 3 4 5 6 7 8 9
 */