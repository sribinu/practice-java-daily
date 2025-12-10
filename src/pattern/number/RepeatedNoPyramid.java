package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT4
 * Question     : Print a centered pyramid using repeated numbers.
 * Title        : RepeatedNoPyramid.java
 * Author       : Sribinu P
 * Created On   : 10-12-2025
 * Topic        : Number Pattern (Centered Repeated Number Pyramid)
 * Difficulty   : Easy
 * Description  : Prints a centered pyramid where each row prints the row number repeated (2*i−1) times.
 * ----------------------------------------------------------
 */

public class RepeatedNoPyramid {

    public static void main(String[] args) {
        // Program SPT4: RepeatedNoPyramid
        // Print (n−i) spaces, then print i repeated (2*i−1) times.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/* Output:
    Enter number of rows N: 5
            1
          2 2 2
        3 3 3 3 3
      4 4 4 4 4 4 4
    5 5 5 5 5 5 5 5 5
 */