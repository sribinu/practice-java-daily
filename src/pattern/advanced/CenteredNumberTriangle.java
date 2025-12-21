package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT8
 * Question     : Print a centered number triangle with row-based sequential numbers.
 * Title        : CenteredNumberTriangle.java
 * Author       : Sribinu P
 * Created On   : 21-12-2025
 * Topic        : Advanced Pattern (Centered Number Triangle)
 * Difficulty   : Easy
 * Description  : This program prints a centered triangle where each row
 *                starts from the row number and prints increasing numbers.
 * ----------------------------------------------------------
 */

public class CenteredNumberTriangle {

    public static void main(String[] args) {
        // Program ADPT8: CenteredNumberTriangle
        // Print leading spaces → print i numbers starting from i.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print sequential numbers starting from row number
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
        1
       2 3
      3 4 5
     4 5 6 7
    5 6 7 8 9
 */