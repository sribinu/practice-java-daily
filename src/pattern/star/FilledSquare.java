package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT1
 * Question     : Print a filled square pattern of '*' of size N × N.
 * Title        : FilledSquare.java
 * Author       : Sribinu P
 * Created On   : 02-12-2025
 * Topic        : Pattern Program (Filled Square)
 * Difficulty   : Easy
 * Description  : This program prints a filled square made of '*' characters of size N by N.
 * ----------------------------------------------------------
 */

public class FilledSquare {

    public static void main(String[] args) {
        // Program SPT1: FilledSquare
        // Workflow: Use two nested for-loops — outer for rows, inner for columns — and print '*' for each cell.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N (size of square): ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j =1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter N (size of square): 5
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
 */