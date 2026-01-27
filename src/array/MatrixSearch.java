package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR34
 * Question     : Search an element in 2D matrix.
 * Title        : MatrixSearch.java
 * Author       : Sribinu P
 * Created On   : 26-01-2026
 * Topic        : Array (2D Matrix Search)
 * Difficulty   : Easy
 * Description  : This program searches for a given element in a 2D matrix and prints its row and column position if found.
 * ----------------------------------------------------------
 */

public class MatrixSearch {

    public static void main(String[] args) {
        // Program ARR34: MatrixSearch
        // Traverse the matrix and compare each element with the key.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.print("Enter the element to search: ");
        int element = scan.nextInt();
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == element) {
                    System.out.println("Element found at the position : (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }

        if (!found)
            System.out.println("Element not found in this matrix");

        scan.close();
    }
}

/* Output:
    Enter the number of rows: 2
    Enter the number of columns: 2
    Enter matrix elements:
    1
    2
    3
    4
    Enter the element to search: 2
    Element found at the position : (0, 1)
 */