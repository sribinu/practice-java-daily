package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT1
 * Question     : Print numbers in rows like: 1 / 1 2 / 1 2 3 ... up to N rows.
 * Title        : NumberTriangle1.java
 * Author       : Sribinu P
 * Created On   : 10-12-2025
 * Topic        : Number Pattern (Number Triangle - Vertical)
 * Difficulty   : Easy
 * Description  : Prints rows of increasing integers where row i contains numbers from 1 to i.
 * ----------------------------------------------------------
 */

public class NumberTriangle1 {

    public static void main(String[] args) {
        // Program NPT1: NumberTriangle1
        // Workflow: For each row i (1..N), print numbers from 1 to i separated by a space.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/* Output:
    Enter number of rows N: 5
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */