package pattern.alphabet;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : APT3
 * Question     : Print centered alphabet pyramid with letters incrementally.
 * Title        : AlphabetPyramid.java
 * Author       : Sribinu P
 * Created On   : 16-12-2025
 * Topic        : Alphabet Pattern (Alphabet Pyramid)
 * Difficulty   : Easy
 * Description  : Prints centered alphabet pyramid with letters incrementally.
 * ----------------------------------------------------------
 */

public class AlphabetPyramid {

    public static void main(String[] args) {
        // Program APT3: AlphabetPyramid
        // Print (N-i) leading spaces, then letters from A to (A+i-1)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
        A
       A B
      A B C
     A B C D
    A B C D E
 */