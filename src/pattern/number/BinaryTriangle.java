package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT10
 * Question     : Print triangle of 0s and 1s alternating by position (binary triangle).
 * Title        : BinaryTriangle.java
 * Author       : Sribinu P
 * Created On   : 12-12-2025
 * Topic        : Number Pattern (Binary Triangle)
 * Difficulty   : Easy
 * Description  : Use (i + j) % 2 to alternate 0 and 1.
 * ----------------------------------------------------------
 */

public class BinaryTriangle {

    public static void main(String[] args) {
        // Program NPT10: BinaryTriangle
        // Workflow: If (i + j) is even, print 1; else print 0.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
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