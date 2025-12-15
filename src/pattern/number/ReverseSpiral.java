package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT17
 * Question     : Print Reverse Spiral Number Pattern
 * Title        : ReverseSpiral.java
 * Author       : Sribinu P
 * Created On   : 15-12-2025
 * Topic        : Number Pattern (Reverse Spiral)
 * Difficulty   : Hard
 * Description  : Prints numbers from N*N to 1 in spiral order.
 * ----------------------------------------------------------
 */

public class ReverseSpiral {

    public static void main(String[] args) {
        // Program NPT17: ReverseSpiral
        // Fill top → right → bottom → left, then shrink boundaries.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];
        int num = n * n;
        int top = 0, right = n - 1;
        int left = 0, bottom = n - 1;

        while (num >= 1) {

            // Left to Right
            for (int i = left; i <= right ; i++) {
                matrix[top][i] = num--;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom ; i++) {
                matrix[i][right] = num--;
            }
            right--;

            // Right to Left
            for (int i = right; i >= left ; i--) {
                matrix[bottom][i] = num--;
            }
            bottom--;

            // Bottom to Top
            for (int i = bottom; i >= top ; i--) {
                matrix[i][left] = num--;
            }
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d" ,matrix[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
      25  24  23  22  21
      10   9   8   7  20
      11   2   1   6  19
      12   3   4   5  18
      13  14  15  16  17
 */