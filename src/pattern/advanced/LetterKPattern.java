package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT5
 * Question     : Print the letter 'K' using '*' for a given height.
 * Title        : LetterKPattern.java
 * Author       : Sribinu P
 * Created On   : 19-12-2025
 * Topic        : Advanced Pattern (K)
 * Difficulty   : Medium
 * Description  : Print the letter ‘K’ using a vertical line and two diagonals meeting at the center.
 * ----------------------------------------------------------
 */

public class LetterKPattern {

    public static void main(String[] args) {
        // Program ADPT5: LetterKPattern
        // Left column always *, right diagonal: i + j == mid + 1 (upper) and i - j == mid - 1 (lower).
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter height N (odd number preferred): ");
        int n = scan.nextInt();

        int mid = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j == 1) ||
                        (i <= mid && i + j == mid + 1) ||
                        (i > mid && i - j == mid - 1)
                ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter height N (odd number preferred): 7
    *     *
    *   *
    * *
    *
    * *
    *   *
    *     *
 */