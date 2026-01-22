package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR29
 * Question     : Subtract two matrices.
 * Title        : MatrixSubtraction.java
 * Author       : Sribinu P
 * Created On   : 22-01-2026
 * Topic        : Array (Matrix Subtraction)
 * Difficulty   : Easy
 * Description  : This program subtracts one matrix from another by subtracting
 *                corresponding elements of two matrices having the same dimensions.
 * ----------------------------------------------------------
 */

public class MatrixSubtraction {

    public static void main(String[] args) {
        // Program ARR29: MatrixSubtraction
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();

        int[][] arr1 = new int[rows][columns];
        int[][] arr2 = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter elements of element matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        System.out.println("Sum of two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter number of rows: 2
    Enter number of columns: 2
    Enter elements of first matrix:
    8
    7
    6
    5
    Enter elements of element matrix:
    4
    3
    2
    1
    Sum of two matrices:
    4 4
    4 4
 */