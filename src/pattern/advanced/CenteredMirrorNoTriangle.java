package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT10
 * Question     : Print a centered mirror number triangle
 * Title        : CenteredMirrorNoTriangle.java
 * Author       : Sribinu P
 * Created On   : 22-12-2025
 * Topic        : Advanced Pattern (Centered Mirror Number Triangle)
 * Difficulty   : Medium
 * Description  : This pattern prints numbers from a starting value to N, first shrinking toward the center and then expanding back, with increasing indentation to keep it centered.
 * ----------------------------------------------------------
 */

public class CenteredMirrorNoTriangle {

    public static void main(String[] args) {
        // Program ADPT10: CenteredMirrorNoTriangle
        // Print shrinking number rows till center, then mirror back.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();

    }
}

/* Output:
    Enter size N: 7
     1 2 3 4 5 6 7
      2 3 4 5 6 7
       3 4 5 6 7
        4 5 6 7
         5 6 7
          6 7
           7
          6 7
         5 6 7
        4 5 6 7
       3 4 5 6 7
      2 3 4 5 6 7
     1 2 3 4 5 6 7
 */