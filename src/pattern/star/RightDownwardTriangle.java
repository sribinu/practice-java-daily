package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT8
 * Question     : Print a right-angled inverted triangle of '*' with height N.
 * Title        : RightDownwardTriangle.java
 * Author       : Sribinu P
 * Created On   : 03-12-2025
 * Topic        : Pattern Program (Right Downward Triangle)
 * Difficulty   : Easy
 * Description  : Prints a right-angled triangle upside down by reducing star count each row.
 * ----------------------------------------------------------
 */

public class RightDownwardTriangle {

    public static void main(String[] args) {
        // Program SPT8: RightDownwardTriangle
        // Start with N stars and reduce stars each row to invert the triangle.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; i + j <= n + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter size N: 5
    * * * * *
    * * * *
    * * *
    * *
    *
 */