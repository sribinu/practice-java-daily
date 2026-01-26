package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR33
 * Question     : Check whether a matrix is sparse.
 * Title        : SparseMatrix.java
 * Author       : Sribinu P
 * Created On   : 25-01-2026
 * Topic        : Array (Sparse Matrix)
 * Difficulty   : Easy
 * Description  : A matrix is called a sparse matrix if the number of zero elements is greater than the number of non-zero elements.
 * ----------------------------------------------------------
 */

public class SparseMatrix {

    public static void main(String[] args) {
        // Program ARR33: SparseMatrix
        // If zeroCount > nonZeroCount, then the matrix is sparse.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scan.nextInt();

        int[][] matrix = new int[rows][cols];
        int zeroCount = 0, nonZeroCount = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
                if (matrix[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }

        if (zeroCount > nonZeroCount) {
            System.out.println("It is a sparse matrix");
        } else {
            System.out.println("It is not a sparse matrix");
        }

        scan.close();
    }
}

/* Output:
    Enter the number of rows: 3
    Enter the number of columns: 3
    Enter matrix elements:
    1
    0
    2
    0
    0
    2
    0
    3
    0
    It is a sparse matrix
 */