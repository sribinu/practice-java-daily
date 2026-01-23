package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR30
 * Question     : Multiply two matrices.
 * Title        : MatrixMultiplication.java
 * Author       : Sribinu P
 * Created On   : 22-01-2026
 * Topic        : Array (Matrix Multiplication)
 * Difficulty   : Easy
 * Description  : This program multiplies two matrices using the matrix
 *                multiplication rule and stores the result in a third matrix.
 * ----------------------------------------------------------
 */

public class MatrixMultiplication {

    public static void main(String[] args) {
        // Program ARR30: MatrixMultiplication
        // result[i][j] += a[i][k] * b[k][j]
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows of first matrix: ");
        int r1 = scan.nextInt();

        System.out.print("Enter number of columns of first matrix: ");
        int c1 = scan.nextInt();

        System.out.print("Enter number of rows of second matrix: ");
        int r2 = scan.nextInt();

        System.out.print("Enter number of columns of second matrix: ");
        int c2 = scan.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];
        int[][] mul = new int[r1][c2];

        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter elements of element matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter number of rows of first matrix: 2
    Enter number of columns of first matrix: 2
    Enter number of rows of second matrix: 2
    Enter number of columns of second matrix: 2
    Enter elements of first matrix:
    1
    2
    3
    4
    Enter elements of element matrix:
    4
    3
    2
    1
    Resultant Matrix:
    8 5
    20 13
 */