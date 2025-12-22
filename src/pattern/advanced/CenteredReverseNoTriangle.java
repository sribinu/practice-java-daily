package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT9
 * Question     : Print a centered number triangle starting from decreasing values up to N.
 * Title        : CenteredReverseNoTriangle.java
 * Author       : Sribinu P
 * Created On   : 22-12-2025
 * Topic        : Advanced Pattern (Centered Reverse Number Triangle)
 * Difficulty   : Easy
 * Description  : Prints a centered number triangle where each row starts from the row value and increases up to N.
 * ----------------------------------------------------------
 */

public class CenteredReverseNoTriangle {

    public static void main(String[] args) {
        // Program ADPT9: CenteredReverseNoTriangle
        // Row i → print i spaces, then numbers from i to N
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 7
           7
          6 7
         5 6 7
        4 5 6 7
       3 4 5 6 7
      2 3 4 5 6 7
     1 2 3 4 5 6 7
 */