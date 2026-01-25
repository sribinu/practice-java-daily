package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR32
 * Question     : Find sum of main diagonal elements of matrix.
 * Title        : MainDiagonalSum.java
 * Author       : Sribinu P
 * Created On   : 25-01-2026
 * Topic        : Array (Matrix Diagonal Sum)
 * Difficulty   : Easy
 * Description  : This program calculates the sum of main (primary) diagonal elements of a square matrix.
 * ----------------------------------------------------------
 */

public class MainDiagonalSum {

    public static void main(String[] args) {
        // Program ARR32: MainDiagonalSum
        // Add elements where i == j.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of main diagonal elements = " + sum);

        scan.close();
    }
}

/* Output:
    Enter size of square matrix: 3
    Enter matrix elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    Sum of main diagonal elements = 15
 */