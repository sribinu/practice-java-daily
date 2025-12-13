package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT15
 * Question     : Print a reverse number triangle starting from N down to 1.
 * Title        : ReverseNoTriangle.java
 * Author       : Sribinu P
 * Created On   : 13-12-2025
 * Topic        : Number Pattern (Reverse Number Triangle)
 * Difficulty   : Easy
 * Description  : This program prints numbers in descending order row by row, reducing one number in each next row.
 * ----------------------------------------------------------
 */

public class ReverseNoTriangle {

    public static void main(String[] args) {
        // Program NPT15: ReverseNoTriangle
        // Outer loop decreases rows, inner loop prints from row value down to 1.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
    5 4 3 2 1
    4 3 2 1
    3 2 1
    2 1
    1
 */