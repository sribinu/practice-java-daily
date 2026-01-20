package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR27
 * Question     : Find sum of all elements in a 2D matrix.
 * Title        : MatrixSum.java
 * Author       : Sribinu P
 * Created On   : 20-01-2026
 * Topic        : Array (Matrix Sum)
 * Difficulty   : Easy
 * Description  : This program reads a 2D matrix and calculates the total sum of all
 *                its elements by traversing each row and column using nested loops.
 * ----------------------------------------------------------
 */

public class MatrixSum {

    public static void main(String[] args) {
        // Program ARR27: MatrixSum
        // Add every matrix[i][j] while traversing the matrix using nested loops.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of all elements = " + sum);

        scan.close();
    }
}

/* Output:
    Enter number of rows: 2
    Enter number of columns: 2
    Enter matrix elements:
    1
    2
    3
    4
    Sum of all elements = 10
 */