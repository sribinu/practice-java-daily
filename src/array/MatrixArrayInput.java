package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR26
 * Question     : Input 2D array (matrix) and display it.
 * Title        : MatrixArrayInput.java
 * Author       : Sribinu P
 * Created On   : 19-01-2026
 * Topic        : Array (2D - Matrix)
 * Difficulty   : Easy
 * Description  : This program reads elements into a 2D array (matrix) using
 *                nested loops and then displays the matrix in row–column format.
 * ----------------------------------------------------------
 */

public class MatrixArrayInput {

    public static void main(String[] args) {
        // Program ARR26: MatrixArrayInput
        // Use two nested loops: outer loop for rows, inner loop for columns.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matrix is:");
        for (int[] one : matrix) {
            for (int element : one) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter number of rows: 3
    Enter number of columns: 3
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
    Matrix is:
    1 2 3
    4 5 6
    7 8 9
 */