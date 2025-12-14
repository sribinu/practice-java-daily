package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT16
 * Question     :
 * Title        : Spiral.java
 * Author       : Sribinu P
 * Created On   : 14-12-2025
 * Topic        : Number Pattern (Spiral)
 * Difficulty   : Intermediate
 * Description  :
 * ----------------------------------------------------------
 */

public class Spiral {

    public static void main(String[] args) {
        // Program NPT16: Spiral

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (num <= n * n) {

            // Left to Right
            for (int j = left; j <= right; j++)
                arr[top][j] = num++;
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++)
                arr[i][right] = num++;
            right--;

            // Right to Left
            for (int j = right; j >= left; j--)
                arr[bottom][j] = num++;
            bottom--;

            // Bottom to Top
            for (int i = bottom; i >= top; i--)
                arr[i][left] = num++;
            left++;
        }

        // Print pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:

 */