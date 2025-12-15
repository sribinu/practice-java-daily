package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT18
 * Question     : Print Anti-Clockwise Spiral Number Pattern
 * Title        : AntiClockwiseSpiral.java
 * Author       : Sribinu P
 * Created On   : 15-12-2025
 * Topic        : Number Pattern (Anti-Clockwise Spiral)
 * Difficulty   : Hard
 * Description  : Fills numbers from 1 to N*N in anti-clockwise spiral order.
 * ----------------------------------------------------------
 */

public class AntiClockwiseSpiral {

    public static void main(String[] args) {
        // Program NPT18: AntiClockwiseSpiral
        // Fill Left → Bottom → Right → Top, then shrink boundaries.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (num <= n * n) {
            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][left] = num++;
            }
            left++;

            // Left to Right
            for (int i = left; i <= right; i++) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // Bottom to Top
            for (int i = bottom; i >= top; i--) {
                matrix[i][right] = num++;
            }
            right--;

            // Right to Left
            for (int i = right; i >= left ; i--) {
                matrix[top][i] = num++;
            }
            top++;
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
       1  16  15  14  13
       2  17  24  23  12
       3  18  25  22  11
       4  19  20  21  10
       5   6   7   8   9
 */