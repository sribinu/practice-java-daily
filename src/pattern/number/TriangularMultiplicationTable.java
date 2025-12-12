package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT14
 * Question     : Print triangular portion of multiplication table for N.
 * Title        : TriangularMultiplicationTable.java
 * Author       : Sribinu P
 * Created On   : 12-12-2025
 * Topic        : Number Pattern (Triangular Multiplication Table)
 * Difficulty   : Easy
 * Description  : Print the multiplication table, but only up to the diagonal — each row prints i × j from j = 1 to i.
 * ----------------------------------------------------------
 */

public class TriangularMultiplicationTable {

    public static void main(String[] args) {
        // Program NPT14: TriangularMultiplicationTable
        // Loop i rows, and inside print i * j for j = 1 to i.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j * i) + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
    1
    2 4
    3 6 9
    4 8 12 16
    5 10 15 20 25
 */