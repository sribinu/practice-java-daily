package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT9
 * Question     : Print rows with sequential numbering continuing across rows.
 * Title        : SequentialNoPyramid.java
 * Author       : Sribinu P
 * Created On   : 11-12-2025
 * Topic        : Number Pattern (Sequential Number Pyramid)
 * Difficulty   : Easy
 * Description  : Numbers continue across rows without resetting.
 * ----------------------------------------------------------
 */

public class SequentialNoPyramid {

    public static void main(String[] args) {
        // Program NPT9: SequentialNoPyramid
        // Workflow: Use a counter 'num' that increments every time you print.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int num = 1;  // continuous counter

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // increment continuously
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter size N: 4
       1
      2 3
     4 5 6
    7 8 9 10
 */