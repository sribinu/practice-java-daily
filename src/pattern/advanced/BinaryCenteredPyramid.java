package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT4
 * Question     : Print a centered pyramid of alternating 0s and 1s.
 * Title        : BinaryCenteredPyramid.java
 * Author       : Sribinu P
 * Created On   : 18-12-2025
 * Topic        : Advanced Pattern (Binary Centered Pyramid)
 * Difficulty   : Easy
 * Description  : Print a centered pyramid where each cell alternates between 0 and 1 based on position.
 * ----------------------------------------------------------
 */

public class BinaryCenteredPyramid {

    public static void main(String[] args) {
        // Program ADPT4: BinaryCenteredPyramid
        // Print spaces → print 0/1 based on (row + column) parity
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
        1
       0 1
      1 0 1
     0 1 0 1
    1 0 1 0 1
 */