package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT5
 * Question     : Print Floyd's triangle (sequential numbers row-wise).
 * Title        : FloydsTriangle.java
 * Author       : Sribinu P
 * Created On   : 10-12-2025
 * Topic        : Number Pattern (Floyd's Triangle)
 * Difficulty   : Easy
 * Description  : Floyd’s Triangle fills numbers sequentially row by row.
 * ----------------------------------------------------------
 */

public class FloydsTriangle {

    public static void main(String[] args) {
        // Program NPT5: FloydsTriangle
        // Keep a running counter and print it i times in each row
        int num = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}

/* Output:
    Enter number of rows N: 4
    1
    2 3
    4 5 6
    7 8 9 10
 */