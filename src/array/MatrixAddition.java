package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR28
 * Question     : Add two matrices.
 * Title        : MatrixAddition.java
 * Author       : Sribinu P
 * Created On   : 21-01-2026
 * Topic        : Array (Matrix Addition)
 * Difficulty   : Easy
 * Description  : This program reads N array elements and a target sum, then finds and prints all
 *                unique pairs of elements whose sum equals the given number using nested loops.
 * ----------------------------------------------------------
 */

public class MatrixAddition {

    public static void main(String[] args) {
        // Program ARR28: MatrixAddition
        // Fix one element and check the remaining elements using a nested loop to find matching pairs.
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
                sum[i][j] = arr1[i][j] + arr2[i][j];
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
    1
    2
    3
    4
    Enter elements of element matrix:
    5
    6
    7
    8
    Sum of two matrices:
    6 8
    10 12
 */