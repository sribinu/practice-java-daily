package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT6
 * Question     : Print Pascal's triangle (binomial coefficients) up to N rows.
 * Title        : PascalsTriangle.java
 * Author       : Sribinu P
 * Created On   : 10-12-2025
 * Topic        : Number Pattern (Pascal's Triangle)
 * Difficulty   : Easy
 * Description  : Each row contains the binomial coefficients, where every element is the sum of the two numbers above it.
 * ----------------------------------------------------------
 */

public class PascalsTriangle {

    public static void main(String[] args) {
        // Program SPT6: PascalsTriangle
        // Use value = value * (i − j) / (j + 1) to compute each next number in the same row.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows N: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + "   ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

/* Pascal value formula:
    Each number is built from the previous number in the same row.
    next = prev * (rowIndex - colIndex) / (colIndex + 1)
    This avoids factorials and generates binomial coefficients efficiently.
   Output:
    Enter number of rows N: 5
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
 */