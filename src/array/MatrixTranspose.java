package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR31
 * Question     : Find transpose of a matrix.
 * Title        : MatrixTranspose.java
 * Author       : Sribinu P
 * Created On   : 23-01-2026
 * Topic        : Array (Matrix Transpose)
 * Difficulty   : Easy
 * Description  : This program finds the transpose of a matrix by converting rows into columns and columns into rows.
 * ----------------------------------------------------------
 */

public class MatrixTranspose {

    public static void main(String[] args) {
        // Program ARR31: MatrixTranspose
        // transpose[j][i] = matrix[i][j]
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter number of rows: 2
    Enter number of columns: 3
    Enter matrix elements:
    1
    2
    3
    4
    5
    6
    Transpose of the matrix:
    1 4
    2 5
    3 6
 */