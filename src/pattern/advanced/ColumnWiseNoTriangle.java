package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT11
 * Question     : Prints a number triangle filled column-wise, not row-wise.
 * Title        : ColumnWiseNoTriangle.java
 * Author       : Sribinu P
 * Created On   : 23-12-2025
 * Topic        : Advanced Pattern (Column-wise Number Triangle)
 * Difficulty   : Medium
 * Description  : Each row starts with its index and fills numbers vertically by adding decreasing gaps.
 * ----------------------------------------------------------
 */

public class ColumnWiseNoTriangle {

    public static void main(String[] args) {
        // Program ADPT11: ColumnWiseNoTriangle
        // next = current + (n - columnIndex)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            int val = i;
            int step = n - 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val += step;
                step--;
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
    1
    2 6
    3 7 10
    4 8 11 13
    5 9 12 14 15
 */